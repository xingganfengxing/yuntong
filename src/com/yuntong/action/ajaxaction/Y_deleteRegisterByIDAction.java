/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action.ajaxaction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.yuntong.service.Y_ISplitRegister;

/** 
 * MyEclipse Struts
 * Creation date: 04-09-2007
 * ���ݻ�Ʊ���ɾ����Ʊ��δ����Ʊ��
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class Y_deleteRegisterByIDAction extends Action {
	private  Log log = LogFactory.getLog(Y_deleteRegisterByIDAction.class);
	private Y_ISplitRegister splitRegister;
	
	public Y_ISplitRegister getSplitRegister() {
		return splitRegister;
	}

	public void setSplitRegister(Y_ISplitRegister splitRegister) {
		this.splitRegister = splitRegister;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		//�õ����
		String strRid=request.getParameter("rid");
		log.info("ɾ�����Ϊ"+strRid+"�ļ�¼=============");
		int rid=Integer.parseInt(strRid);
		//ɾ����Ϣ
		splitRegister.deleteRegisterByID(rid);
		log.info("ɾ���ɹ�����ajaxaction");
		return null;
	}
}