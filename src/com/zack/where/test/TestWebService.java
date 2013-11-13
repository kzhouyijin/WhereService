package com.zack.where.test;

import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import com.zack.where.response.ResponseBean;





public class TestWebService {

	//服务访问地址 http://localhost:8080/WhereService/services/UserService?wsdl
	
	public static void main(String [] args)
	{
		try
		{
			EndpointReference targetEPR = new EndpointReference("http://localhost:8080/WhereService/services/UserService");
	    	RPCServiceClient serviceClient = new RPCServiceClient();
	        Options options = serviceClient.getOptions();
	        options.setTo(targetEPR);
	        
	        QName opCountUser = new QName("http://webservice.where.zack.com", "CountAllUser");
	        Object[] opCountUserArgs = new Object[] { };
	        Class[] returnTypes = new Class[] { ResponseBean.class };
	        Object[] response = serviceClient.invokeBlocking(opCountUser,opCountUserArgs, returnTypes);

	        ResponseBean result = (ResponseBean) response[0];
	        if (result == null) {
	            System.out.println("Weather didn't initialize!");
	        }else{
	            System.out.println("MSG               : " + result.getMsg());
	            System.out.println("CODE                  : " + result.getCode());

	        }
		}
		catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		

     
	}
}
