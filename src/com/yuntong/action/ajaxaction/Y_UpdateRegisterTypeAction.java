/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action.ajaxaction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.service.Y_IRegisterManagerService;


/** 
 * MyEclipse Struts
 * Creation date: 04-07-2007
 * �ı��Ʊ״̬(����ȷ��)
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class Y_UpdateRegisterTypeAction extends Action {
	private Log log = LogFactory.getLog(Y_UpdateRegisterTypeAction.class);
		private Y_IRegisterManagerService service;
		public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
			 response.setContentType("text/html");
			PrintWriter out = response.getWriter();
		//�õ���ǰ��Ʊ��ţ�״̬
		HttpSession session=request.getSession();
		//���û�в�ѯ��Ϣ����
		if(session.getAttribute("Y_rid")==null||session.getAttribute("Y_sid")==null){
			out.print("���Ȳ�ѯ��Ʊ");
			return null;
		}
		log.info(session.getAttribute("Y_rid"));
		String strRid=session.getAttribute("Y_rid").toString();
		String strSid=session.getAttribute("Y_sid").toString();				
		int rid= Integer.parseInt(strRid);
		int sid= Integer.parseInt(strSid);
		//�жϸ���Ϊ����״̬
		if(sid==3){
			sid=5;
		}else if(sid==4){
			sid=6;
		}else{
			out.println("�˻�ƱΪ��ȷ�ϻ�Ʊ��δ���ۻ�Ʊ");
			return null;
		}
		session.removeAttribute("Y_rid");
		session.removeAttribute("Y_sid");
		try{
		service.updateRegisterType(rid, sid);
		//�õ�˾�����������
		int did= Integer.parseInt(session.getAttribute("Y_did")+"");
		int cid= Integer.parseInt(session.getAttribute("Y_cid")+"");
		
		//�޸ĳ���˾��״̬
		log.info("//�޸ĳ���˾��״̬");
		service.updateCarAndDriver(cid, did);		
		
		out.println("ȷ�ϳɹ�");
		log.info("���³ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			out.println("�˻�ƱΪ��ȷ�ϻ�Ʊ��δ���ۻ�Ʊ");
			log.info("״̬����ʧ�ܡ�����������������");
		}
		return null;
	}
		public Y_IRegisterManagerService getService() {
			return service;
		}
		public void setService(Y_IRegisterManagerService service) {
			this.service = service;
		}
}