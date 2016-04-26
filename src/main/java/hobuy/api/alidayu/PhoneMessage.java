package hobuy.api.alidayu;

import java.io.StringReader;
import java.util.Random;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.junit.Test;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class PhoneMessage {
	public boolean registMessage(String phone, String code) throws Exception {
		TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", "23307792",
				"b6d85e09aa9df723e0d869952eed4ded");
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("123456");
		req.setSmsType("normal");
		req.setSmsFreeSignName("注册验证");
		req.setSmsParamString("{\"code\":\"" + code + "\",\"product\":\"HoBuy\"}");
		req.setRecNum(phone);
		req.setSmsTemplateCode("SMS_5072375");
		AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
		String result = rsp.getBody();
		// System.out.println(result);
		JsonReader jsonReader = Json.createReader(new StringReader(result));
		JsonObject jsonObject = jsonReader.readObject();
		if (jsonObject.containsKey("alibaba_aliqin_fc_sms_num_send_response")) {
			return true;
		} else {
			System.out.println(result);
			return false;
		}
	}

	@Test
	public void test() throws Exception {
		// registMessage("18352864862", "1234");
		randomNumber(4);
	}

	public String randomNumber(int length) {
		Random random = new Random();
		String number = "";
		for (int i = 0; i < length; i++) {
			number += random.nextInt(9) + "";
		}
		return number;
	}

}
