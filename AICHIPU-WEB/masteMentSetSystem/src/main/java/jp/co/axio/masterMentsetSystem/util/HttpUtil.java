package jp.co.axio.masterMentsetSystem.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

//import org.apache.commons.lang3.tuple.Pair;

public class HttpUtil {

	public static String executePost(String url, LinkedHashMap<String, String>headers, LinkedHashMap<String, String>datas) throws IOException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException {

		CloseableHttpClient httpclient = HttpClients.createDefault();

        // リクエストヘッダ
		HttpPost httppost = new HttpPost(url);
        for( Entry<String, String> e: headers.entrySet()) {
        	httppost.addHeader(e.getKey(), e.getValue());
        }

        // リクエストボディ
        List <NameValuePair> nvps = new ArrayList <NameValuePair>();
        for( Entry<String, String> e: datas.entrySet()) {
            nvps.add(new BasicNameValuePair(e.getKey(), e.getValue()));
        }
        httppost.setEntity(new UrlEncodedFormEntity(nvps));

        CloseableHttpResponse response = null;
        HttpEntity resEntity = null;

		try {
			response = httpclient.execute(httppost);
	    	resEntity = response.getEntity();

	    	byte[] bBody = EntityUtils.toByteArray(resEntity);
	    	String sBody = new String(bBody, StandardCharsets.UTF_8);
	    	if (StringUtil.isBlank(sBody)) {
	    		return response.getStatusLine().toString();
	    	}

	    	return sBody;
	    } catch (IOException e) {
	        //e.printStackTrace();
	        throw e;
		} finally {
			try {
		        EntityUtils.consume(resEntity);

		        if(response != null) {
			        response.close();
				}
				if(httpclient != null) {
					httpclient.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		//return "";
	}


	public static String executePostNoVerify(String url, LinkedHashMap<String, String>headers, LinkedHashMap<String, String>datas) throws IOException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException {

		//CloseableHttpClient httpclient = HttpClients.createDefault();

		//SSLContext sslContext = SSLContexts.createSystemDefault();

		SSLContext sslContext = SSLContexts.custom()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

		//SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory( sslContext, NoopHostnameVerifier.INSTANCE );
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory( sslContext, new String[] {"SSLv2Hello", "SSLv3", "TLSv1","TLSv1.1", "TLSv1.2" }, null, NoopHostnameVerifier.INSTANCE );

		// new String[] {"SSLv2Hello", "SSLv3", "TLSv1","TLSv1.1", "TLSv1.2" }, null,


		CloseableHttpClient httpclient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .build();



        // リクエストヘッダ
		HttpPost httppost = new HttpPost(url);
        for( Entry<String, String> e: headers.entrySet()) {
        	httppost.addHeader(e.getKey(), e.getValue());
        }

        // リクエストボディ
        List <NameValuePair> nvps = new ArrayList <NameValuePair>();
        for( Entry<String, String> e: datas.entrySet()) {
            nvps.add(new BasicNameValuePair(e.getKey(), e.getValue()));
        }
        httppost.setEntity(new UrlEncodedFormEntity(nvps));

        CloseableHttpResponse response = null;
        HttpEntity resEntity = null;

		try {
			response = httpclient.execute(httppost);
	    	resEntity = response.getEntity();

	    	byte[] bBody = EntityUtils.toByteArray(resEntity);
	    	String sBody = new String(bBody, StandardCharsets.UTF_8);
	    	if (StringUtil.isBlank(sBody)) {
	    		return response.getStatusLine().toString();
	    	}

	    	return sBody;
	    } catch (IOException e) {
	        //e.printStackTrace();
	        throw e;
		} finally {
			try {
		        EntityUtils.consume(resEntity);

		        if(response != null) {
			        response.close();
				}
				if(httpclient != null) {
					httpclient.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		//return "";
	}


	public static String executePostAcceptAll(String url, LinkedHashMap<String, String>headers, LinkedHashMap<String, String>datas) throws IOException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
		// https://www.baeldung.com/httpclient-ssl
		// 4. Configure SSL – Accept All (HttpClient 4.5)

		//CloseableHttpClient httpclient = HttpClients.createDefault();


		TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;

		SSLContext sslContext = SSLContexts.custom()
			.loadTrustMaterial(null, acceptingTrustStrategy).build();

		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);

	    Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
		    .register("https", sslsf)
		    .register("http", new PlainConnectionSocketFactory())
		    .build();

	    BasicHttpClientConnectionManager connectionManager = new BasicHttpClientConnectionManager(socketFactoryRegistry);

	    CloseableHttpClient httpclient = HttpClients.custom()
	    	.setSSLSocketFactory(sslsf)
	    	.setConnectionManager(connectionManager)
	    	.build();


        // リクエストヘッダ
		HttpPost httppost = new HttpPost(url);
        for( Entry<String, String> e: headers.entrySet()) {
        	httppost.addHeader(e.getKey(), e.getValue());
        }

        // リクエストボディ
        List <NameValuePair> nvps = new ArrayList <NameValuePair>();
        for( Entry<String, String> e: datas.entrySet()) {
            nvps.add(new BasicNameValuePair(e.getKey(), e.getValue()));
        }
        httppost.setEntity(new UrlEncodedFormEntity(nvps));

        CloseableHttpResponse response = null;
        HttpEntity resEntity = null;

		try {
			response = httpclient.execute(httppost);
	    	resEntity = response.getEntity();

	    	byte[] bBody = EntityUtils.toByteArray(resEntity);
	    	String sBody = new String(bBody, StandardCharsets.UTF_8);
	    	if (StringUtil.isBlank(sBody)) {
	    		return response.getStatusLine().toString();
	    	}

	    	return sBody;
	    } catch (IOException e) {
	        //e.printStackTrace();
	        throw e;
		} finally {
			try {
		        EntityUtils.consume(resEntity);

		        if(response != null) {
			        response.close();
				}
				if(httpclient != null) {
					httpclient.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
		//return "";
	}


	public static String executeMultipart(String url, LinkedHashMap<String, String>headers, LinkedHashMap<String, String>datas) throws IOException
	{

		CloseableHttpClient httpclient = HttpClients.createDefault();

        // リクエストヘッダ
		HttpPost httppost = new HttpPost(url);
        for( Entry<String, String> e: headers.entrySet()) {
        	httppost.addHeader(e.getKey(), e.getValue());
        }

        // リクエストボディ
        MultipartEntityBuilder meb = MultipartEntityBuilder.create();
        for( Entry<String, String> e: datas.entrySet()) {
        	meb = meb.addPart(e.getKey(), new StringBody(e.getValue(), ContentType.TEXT_PLAIN));
        }
        HttpEntity reqEntity = meb.build();
        httppost.setEntity(reqEntity);

        CloseableHttpResponse response = null;
        HttpEntity resEntity = null;

		try {
			response = httpclient.execute(httppost);
	    	resEntity = response.getEntity();

	    	byte[] bBody = EntityUtils.toByteArray(resEntity);
	    	String sBody = new String(bBody, StandardCharsets.UTF_8);
	    	if (StringUtil.isBlank(sBody)) {
	    		return response.getStatusLine().toString();
	    	}

	    	return sBody;
	    } catch (IOException e) {
	        //e.printStackTrace();
	        throw e;
		} finally {
			try {
		        EntityUtils.consume(resEntity);

		        if(response != null) {
			        response.close();
				}
				if(httpclient != null) {
					httpclient.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
