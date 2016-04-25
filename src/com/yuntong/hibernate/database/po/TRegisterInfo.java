package com.yuntong.hibernate.database.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * TRegisterInfo generated by MyEclipse - Hibernate Tools
 */

public class TRegisterInfo  implements java.io.Serializable {


    // Fields    

     private Integer registerId;
     private TFreightStyle TFreightStyle;
     private TRegisterState TRegisterState;
     private TFactoryInfo TFactoryInfo;
     private TUserInfo TUserInfo;
     private TGoodsInfo TGoodsInfo;
     private TClientInfo TClientInfo;
     private Long registerGlideId;
     private String registerConveyanceId;
     private String registerLine;
     private String registerPayerName;
     private Date registerDate;
     private String registerRemark;
     private Set TDisrepareInfos = new HashSet(0);
     private Set TTrafficLogs = new HashSet(0);
     private Set TAgioInfos = new HashSet(0);
     private Set TDrawInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public TRegisterInfo() {
    }

	/** minimal constructor */
    public TRegisterInfo(Integer registerId) {
        this.registerId = registerId;
    }
    
    /** full constructor */
    public TRegisterInfo(Integer registerId, TFreightStyle TFreightStyle, TRegisterState TRegisterState, TFactoryInfo TFactoryInfo, TUserInfo TUserInfo, TGoodsInfo TGoodsInfo, TClientInfo TClientInfo, Long registerGlideId, String registerConveyanceId, String registerLine, String registerPayerName, Date registerDate, String registerRemark, Set TDisrepareInfos, Set TTrafficLogs, Set TAgioInfos, Set TDrawInfos) {
        this.registerId = registerId;
        this.TFreightStyle = TFreightStyle;
        this.TRegisterState = TRegisterState;
        this.TFactoryInfo = TFactoryInfo;
        this.TUserInfo = TUserInfo;
        this.TGoodsInfo = TGoodsInfo;
        this.TClientInfo = TClientInfo;
        this.registerGlideId = registerGlideId;
        this.registerConveyanceId = registerConveyanceId;
        this.registerLine = registerLine;
        this.registerPayerName = registerPayerName;
        this.registerDate = registerDate;
        this.registerRemark = registerRemark;
        this.TDisrepareInfos = TDisrepareInfos;
        this.TTrafficLogs = TTrafficLogs;
        this.TAgioInfos = TAgioInfos;
        this.TDrawInfos = TDrawInfos;
    }

   
    // Property accessors

    public Integer getRegisterId() {
        return this.registerId;
    }
    
    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public TFreightStyle getTFreightStyle() {
        return this.TFreightStyle;
    }
    
    public void setTFreightStyle(TFreightStyle TFreightStyle) {
        this.TFreightStyle = TFreightStyle;
    }

    public TRegisterState getTRegisterState() {
        return this.TRegisterState;
    }
    
    public void setTRegisterState(TRegisterState TRegisterState) {
        this.TRegisterState = TRegisterState;
    }

    public TFactoryInfo getTFactoryInfo() {
        return this.TFactoryInfo;
    }
    
    public void setTFactoryInfo(TFactoryInfo TFactoryInfo) {
        this.TFactoryInfo = TFactoryInfo;
    }

    public TUserInfo getTUserInfo() {
        return this.TUserInfo;
    }
    
    public void setTUserInfo(TUserInfo TUserInfo) {
        this.TUserInfo = TUserInfo;
    }

    public TGoodsInfo getTGoodsInfo() {
        return this.TGoodsInfo;
    }
    
    public void setTGoodsInfo(TGoodsInfo TGoodsInfo) {
        this.TGoodsInfo = TGoodsInfo;
    }

    public TClientInfo getTClientInfo() {
        return this.TClientInfo;
    }
    
    public void setTClientInfo(TClientInfo TClientInfo) {
        this.TClientInfo = TClientInfo;
    }

    public Long getRegisterGlideId() {
        return this.registerGlideId;
    }
    
    public void setRegisterGlideId(Long registerGlideId) {
        this.registerGlideId = registerGlideId;
    }

    public String getRegisterConveyanceId() {
        return this.registerConveyanceId;
    }
    
    public void setRegisterConveyanceId(String registerConveyanceId) {
        this.registerConveyanceId = registerConveyanceId;
    }

    public String getRegisterLine() {
        return this.registerLine;
    }
    
    public void setRegisterLine(String registerLine) {
        this.registerLine = registerLine;
    }

    public String getRegisterPayerName() {
        return this.registerPayerName;
    }
    
    public void setRegisterPayerName(String registerPayerName) {
        this.registerPayerName = registerPayerName;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }
    
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterRemark() {
        return this.registerRemark;
    }
    
    public void setRegisterRemark(String registerRemark) {
        this.registerRemark = registerRemark;
    }

    public Set getTDisrepareInfos() {
        return this.TDisrepareInfos;
    }
    
    public void setTDisrepareInfos(Set TDisrepareInfos) {
        this.TDisrepareInfos = TDisrepareInfos;
    }

    public Set getTTrafficLogs() {
        return this.TTrafficLogs;
    }
    
    public void setTTrafficLogs(Set TTrafficLogs) {
        this.TTrafficLogs = TTrafficLogs;
    }

    public Set getTAgioInfos() {
        return this.TAgioInfos;
    }
    
    public void setTAgioInfos(Set TAgioInfos) {
        this.TAgioInfos = TAgioInfos;
    }

    public Set getTDrawInfos() {
        return this.TDrawInfos;
    }
    
    public void setTDrawInfos(Set TDrawInfos) {
        this.TDrawInfos = TDrawInfos;
    }
   








}