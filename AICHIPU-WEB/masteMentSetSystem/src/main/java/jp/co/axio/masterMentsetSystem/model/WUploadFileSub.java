package jp.co.axio.masterMentsetSystem.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * アップロードファイル一時
 */
@Data
public class WUploadFileSub implements Serializable {
    /**
     * アップロードユーザーID
     */
    private String uploadUserId;

    /**
     * アップロード日時
     */
    private Date uploadUserTs;
    /**
     * アップロードセッション
     */
    private String uploadSession;
    /**
     * 行番号
     */
    private Integer rowNo;
    /**
     * 行データ
     */
    private String rowData;

    /**
     * チェックフラグ
     */
    private String checkFlag;

    /**
     * チェックメッセージ
     */
    private String checkMessage;

    /**
     * 処理区分
     */
    private String processKbn;

    /**
     * ユーザID
     */
    private String userId;

    /**
     * 反映日
     */
    private Date reflectionDate;

    /**
     * 項目1
     */
    @TableField("column_1")
    private String column1;

    /**
     * 項目2
     */
    @TableField("column_2")
    private String column2;

    /**
     * 項目3
     */
    @TableField("column_3")
    private String column3;

    /**
     * 項目4
     */
    @TableField("column_4")
    private String column4;

    /**
     * 項目5
     */
    @TableField("column_5")
    private String column5;

    /**
     * 項目6
     */
    private String column6;

    /**
     * 項目7
     */
    private String column7;

    /**
     * 項目8
     */
    private String column8;

    /**
     * 項目9
     */
    private String column9;

    /**
     * 項目10
     */
    private String column10;

    /**
     * 項目11
     */
    private String column11;

    /**
     * 項目12
     */
    private String column12;

    /**
     * 項目13
     */
    private String column13;

    /**
     * 項目14
     */
    private String column14;

    /**
     * 項目15
     */
    private String column15;

    /**
     * 項目16
     */
    private String column16;

    /**
     * 項目17
     */
    private String column17;

    /**
     * 項目18
     */
    private String column18;

    /**
     * 項目19
     */
    private String column19;

    /**
     * 項目20
     */
    private String column20;

    /**
     * 項目21
     */
    private String column21;

    /**
     * 項目22
     */
    private String column22;

    /**
     * 項目23
     */
    private String column23;

    /**
     * 項目24
     */
    private String column24;

    /**
     * 項目25
     */
    private String column25;

    /**
     * 項目26
     */
    private String column26;

    /**
     * 項目27
     */
    private String column27;

    /**
     * 項目28
     */
    private String column28;

    /**
     * 項目29
     */
    private String column29;

    /**
     * 項目30
     */
    private String column30;

    /**
     * 項目31
     */
    private String column31;

    /**
     * 項目32
     */
    private String column32;

    /**
     * 項目33
     */
    private String column33;

    /**
     * 項目34
     */
    private String column34;

    /**
     * 項目35
     */
    private String column35;

    /**
     * 項目36
     */
    private String column36;

    /**
     * 項目37
     */
    private String column37;

    /**
     * 項目38
     */
    private String column38;

    /**
     * 項目39
     */
    private String column39;

    /**
     * 項目40
     */
    private String column40;

    /**
     * 項目41
     */
    private String column41;

    /**
     * 項目42
     */
    private String column42;

    /**
     * 項目43
     */
    private String column43;

    /**
     * 項目44
     */
    private String column44;

    /**
     * 項目45
     */
    private String column45;

    /**
     * 項目46
     */
    private String column46;

    /**
     * 項目47
     */
    private String column47;

    /**
     * 項目48
     */
    private String column48;

    /**
     * 項目49
     */
    private String column49;

    /**
     * 項目50
     */
    private String column50;

    /**
     * 項目51
     */
    private String column51;

    /**
     * 項目52
     */
    private String column52;

    /**
     * 項目53
     */
    private String column53;

    /**
     * 項目54
     */
    private String column54;

    /**
     * 項目55
     */
    private String column55;

    /**
     * 項目56
     */
    private String column56;

    /**
     * 項目57
     */
    private String column57;

    /**
     * 項目58
     */
    private String column58;

    /**
     * 項目59
     */
    private String column59;

    /**
     * 項目60
     */
    private String column60;

    /**
     * 項目61
     */
    private String column61;

    /**
     * 項目62
     */
    private String column62;

    /**
     * 項目63
     */
    private String column63;

    /**
     * 項目64
     */
    private String column64;

    /**
     * 項目65
     */
    private String column65;

    /**
     * 項目66
     */
    private String column66;

    /**
     * 項目67
     */
    private String column67;

    /**
     * 項目68
     */
    private String column68;

    /**
     * 項目69
     */
    private String column69;

    /**
     * 項目70
     */
    private String column70;

    /**
     * 項目71
     */
    private String column71;

    /**
     * 項目72
     */
    private String column72;

    /**
     * 項目73
     */
    private String column73;

    /**
     * 項目74
     */
    private String column74;

    /**
     * 項目75
     */
    private String column75;

    /**
     * 項目76
     */
    private String column76;

    /**
     * 項目77
     */
    private String column77;

    /**
     * 項目78
     */
    private String column78;

    /**
     * 項目79
     */
    private String column79;

    /**
     * 項目80
     */
    private String column80;

    /**
     * 項目81
     */
    private String column81;

    /**
     * 項目82
     */
    private String column82;

    /**
     * 項目83
     */
    private String column83;

    /**
     * 項目84
     */
    private String column84;

    /**
     * 項目85
     */
    private String column85;

    /**
     * 項目86
     */
    private String column86;

    /**
     * 項目87
     */
    private String column87;

    /**
     * 項目88
     */
    private String column88;

    /**
     * 項目89
     */
    private String column89;

    /**
     * 項目90
     */
    private String column90;

    /**
     * 項目91
     */
    private String column91;

    /**
     * 項目92
     */
    private String column92;

    /**
     * 項目93
     */
    private String column93;

    /**
     * 項目94
     */
    private String column94;

    /**
     * 項目95
     */
    private String column95;

    /**
     * 項目96
     */
    private String column96;

    /**
     * 項目97
     */
    private String column97;

    /**
     * 項目98
     */
    private String column98;

    /**
     * 項目99
     */
    private String column99;

    /**
     * 項目100
     */
    private String column100;

    /**
     * 項目101
     */
    private String column101;

    /**
     * 項目102
     */
    private String column102;

    /**
     * 項目103
     */
    private String column103;

    /**
     * 項目104
     */
    private String column104;

    /**
     * 項目105
     */
    private String column105;

    /**
     * 項目106
     */
    private String column106;

    /**
     * 項目107
     */
    private String column107;

    /**
     * 項目108
     */
    private String column108;

    /**
     * 項目109
     */
    private String column109;

    /**
     * 項目110
     */
    private String column110;

    /**
     * 項目111
     */
    private String column111;

    /**
     * 項目112
     */
    private String column112;

    /**
     * 項目113
     */
    private String column113;

    /**
     * 項目114
     */
    private String column114;

    /**
     * 項目115
     */
    private String column115;

    /**
     * 項目116
     */
    private String column116;

    /**
     * 項目117
     */
    private String column117;

    /**
     * 項目118
     */
    private String column118;

    /**
     * 項目119
     */
    private String column119;

    /**
     * 項目120
     */
    private String column120;

    /**
     * 項目121
     */
    private String column121;

    /**
     * 項目122
     */
    private String column122;

    /**
     * 項目123
     */
    private String column123;

    /**
     * 項目124
     */
    private String column124;

    /**
     * 項目125
     */
    private String column125;

    /**
     * 項目126
     */
    private String column126;

    /**
     * 項目127
     */
    private String column127;

    /**
     * 項目128
     */
    private String column128;

    /**
     * 項目129
     */
    private String column129;

    /**
     * 項目130
     */
    private String column130;

    /**
     * 項目131
     */
    private String column131;

    /**
     * 項目132
     */
    private String column132;

    /**
     * 項目133
     */
    private String column133;

    /**
     * 項目134
     */
    private String column134;

    /**
     * 項目135
     */
    private String column135;

    /**
     * 項目136
     */
    private String column136;

    /**
     * 項目137
     */
    private String column137;

    /**
     * 項目138
     */
    private String column138;

    /**
     * 項目139
     */
    private String column139;

    /**
     * 項目140
     */
    private String column140;

    /**
     * 項目141
     */
    private String column141;

    /**
     * 項目142
     */
    private String column142;

    /**
     * 項目143
     */
    private String column143;

    /**
     * 項目144
     */
    private String column144;

    /**
     * 項目145
     */
    private String column145;

    /**
     * 項目146
     */
    private String column146;

    /**
     * 項目147
     */
    private String column147;

    /**
     * 項目148
     */
    private String column148;

    /**
     * 項目149
     */
    private String column149;

    /**
     * 項目150
     */
    private String column150;

    /**
     * 項目151
     */
    private String column151;

    /**
     * 項目152
     */
    private String column152;

    /**
     * 項目153
     */
    private String column153;

    /**
     * 項目154
     */
    private String column154;

    /**
     * 項目155
     */
    private String column155;

    /**
     * 項目156
     */
    private String column156;

    /**
     * 項目157
     */
    private String column157;

    /**
     * 項目158
     */
    private String column158;

    /**
     * 項目159
     */
    private String column159;

    /**
     * 項目160
     */
    private String column160;

    /**
     * 項目161
     */
    private String column161;

    /**
     * 項目162
     */
    private String column162;

    /**
     * 項目163
     */
    private String column163;

    /**
     * 項目164
     */
    private String column164;

    /**
     * 項目165
     */
    private String column165;

    /**
     * 項目166
     */
    private String column166;

    /**
     * 項目167
     */
    private String column167;

    /**
     * 項目168
     */
    private String column168;

    /**
     * 項目169
     */
    private String column169;

    /**
     * 項目170
     */
    private String column170;

    /**
     * 項目171
     */
    private String column171;

    /**
     * 項目172
     */
    private String column172;

    /**
     * 項目173
     */
    private String column173;

    /**
     * 項目174
     */
    private String column174;

    /**
     * 項目175
     */
    private String column175;

    /**
     * 項目176
     */
    private String column176;

    /**
     * 項目177
     */
    private String column177;

    /**
     * 項目178
     */
    private String column178;

    /**
     * 項目179
     */
    private String column179;

    /**
     * 項目180
     */
    private String column180;

    /**
     * 項目181
     */
    private String column181;

    /**
     * 項目182
     */
    private String column182;

    /**
     * 項目183
     */
    private String column183;

    /**
     * 項目184
     */
    private String column184;

    /**
     * 項目185
     */
    private String column185;

    /**
     * 項目186
     */
    private String column186;

    /**
     * 項目187
     */
    private String column187;

    /**
     * 項目188
     */
    private String column188;

    /**
     * 項目189
     */
    private String column189;

    /**
     * 項目190
     */
    private String column190;

    /**
     * 項目191
     */
    private String column191;

    /**
     * 項目192
     */
    private String column192;

    /**
     * 項目193
     */
    private String column193;

    /**
     * 項目194
     */
    private String column194;

    /**
     * 項目195
     */
    private String column195;

    /**
     * 項目196
     */
    private String column196;

    /**
     * 項目197
     */
    private String column197;

    /**
     * 項目198
     */
    private String column198;

    /**
     * 項目199
     */
    private String column199;

    /**
     * 項目200
     */
    private String column200;

    /**
     * 登録者ID
     */
    private String registerId;

    /**
     * 登録日時
     */
    private Date registTs;

    /**
     * 更新者ID
     */
    private String updaterId;

    /**
     * 更新日時
     */
    private Date updateTs;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}