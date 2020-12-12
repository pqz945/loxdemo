import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {


    public static void main(String[] args) {
        HttpClient client = new HttpClient();

        String url = "https://sms.yunpian.com/v2/sms/single_send.json";
        try {
            client.getHttpConnectionManager().getParams()
                    .setConnectionTimeout(3000);
            client.getHttpConnectionManager().getParams()
                    .setSoTimeout(3000);


            PostMethod method = new PostMethod(url);


            String context = "修改提现账户信息验证码：776523，请在页面输入以完成验证码，验证码有效时间30分钟，有效时间内请勿再次点击发送！";

            context = "尊敬的客户272619G，您的密码已重置成随机密码123456，请及时登录三维猴官网 www.sanweihou.com 修改密码。";//yes

            context = "尊敬的272619G客户，您正在通过手机短信验证找回密码，您的本次验证码是776553";

            context = "尊敬的272619G客户，您正在通过手机短信验证修改绑定手机号码，您的本次验证码是776555";

            context = "尊敬的272619G，您进行了账户余额转出操作，转出金额5.2元。如非本人操作，请立即联系我司客服。";//yes

            context = "尊敬的272619G，您的3D打印订单已审核，请尽快确认。为避免打扰，审核信息一天只发一条，回复TD拒收";//y

            context = "尊敬的272619G客户，您的3D打印订单已经发货，单号:8456547845顺丰快递!";//y


            context = "修改提现账户信息验证码：776523，请在页面输入以完成验证码，验证码有效时间30分钟，有效时间内请勿再次点击发送！";

            context = "提现验证码：776523，请在页面中输入以完成验证，验证码有效时间30分钟，有效时间内请勿再次点击发送！";

            context = "修改提现账户信息验证码：776523，请在页面中输入以完成验证，验证码有效时间30分钟，有效时间内请勿再次点击发送！";

            Map<String, String> param = new HashMap<String, String>();
            param.put("apikey", "ff3a03657eca883139bafeeba9941350");
            param.put("text", context);
            param.put("mobile", "+8615914116853");



            NameValuePair[] nameValuePairs = new NameValuePair[param.size()];
            int i =0;
            for (Map.Entry<String, String> para : param.entrySet()) {
                NameValuePair pair = new NameValuePair(para.getKey()
                        , para.getValue());
                nameValuePairs[i++] = pair;
            }

            method.setRequestBody(nameValuePairs);
            HttpMethodParams params = method.getParams();
            params.setContentCharset("UTF-8");
            client.executeMethod(method);

            System.out.printf(method.getResponseBodyAsString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
