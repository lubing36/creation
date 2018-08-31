package cn.lubing36.football;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FootballController {

	private static final String APPKEY = "b117c2eafc34062c17f1a341c66b7ac6";
	private static final String CHARSET = "UTF-8";
	private static final String URL ="http://op.juhe.cn/onebox/football";
	private static final String DTYPE = "json";
	
	
	
	@RequestMapping(value="football")
	public String queryFootball(Model model){
// 		String url = URL + "/league?key=" + APPKEY + "&league=" + "%E8%8B%B1%E8%B6%85";
//		String info = send(url, null);
//		JSONObject obj = JSON.parseObject(info).getJSONObject("result").getJSONObject("views");
//		
//		String saicheng1 = obj.getString("saicheng1");
//		String saicheng2 = obj.getString("saicheng2");
//		String saicheng3 = obj.getString("saicheng3");
//		List<Saichenginfo> list1 = new ArrayList<Saichenginfo>();
//		List<Saichenginfo> list2 = new ArrayList<Saichenginfo>();
//		List<Saichenginfo> list3 = new ArrayList<Saichenginfo>();
//		if(StringUtils.isNotBlank(saicheng1)){
//			list1 = JSON.parseArray(saicheng1, Saichenginfo.class);
//		}
//		if(StringUtils.isNotBlank(saicheng2)){
//			list2 = JSON.parseArray(saicheng2, Saichenginfo.class);
//			list1.addAll(list2);
//		}
//		if(StringUtils.isNotBlank(saicheng3)){
//			list3 = JSON.parseArray(saicheng3, Saichenginfo.class);
//			list1.addAll(list3);
//		}
//		
//		model.addAttribute("list", list1);
		return "football.page";
	}
	
	/**
	 * 数据发送
	 * @return
	 */
	private String send(String url, String data){
		String result ="";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
		
		/*如果数据不为空*/
		if(StringUtils.isNotBlank(data)){
			StringEntity entity;
			try {
				entity = new StringEntity(data);
				httpPost.setEntity(entity);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		
		HttpResponse response = null;
		try {
			response = httpClient.execute(httpPost);
			if(response.getStatusLine().getStatusCode() == 200){
				result =EntityUtils.toString(response.getEntity());
				System.out.println(result);
			}else{
				System.out.println("请求错误。错误码：" + response.getStatusLine().getStatusCode());
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
//	public static void main(String[] args) {
//		String str = "{\"reason\":\"查询成功\",\"result\":{\"key\":\"中超\",\"tabs\":{\"saicheng1\":\"第8轮赛程\",\"saicheng2\":\"第9轮赛程\",\"saicheng3\":null,\"jifenbang\":\"积分榜\",\"sheshoubang\":\"射手榜\"},\"views\":{\"saicheng1\":[{\"c1\":\"已结束\",\"c2\":\"04-28周六\",\"c3\":\"15:30\",\"c4T1\":\"北京人和\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/renhe/?cre=360.ala.zc.sc\",\"c4R\":\"1-0\",\"c4T2\":\"天津泰达\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/tianjin/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"全场战报\",\"c52Link\":\"http://sports.sina.com.cn/china/j/2018-04-28/doc-ifzvpatq6437793.shtml?cre=360.ala.zc.sc\",\"liveid\":\"977265\"},{\"c1\":\"已结束\",\"c2\":\"04-28周六\",\"c3\":\"19:35\",\"c4T1\":\"广州恒大\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/guangzhou/?cre=360.ala.zc.sc\",\"c4R\":\"1-0\",\"c4T2\":\"江苏苏宁\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/jiangsu/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"战报暂无\",\"c52Link\":\"\",\"liveid\":\"977266\"},{\"c1\":\"已结束\",\"c2\":\"04-28周六\",\"c3\":\"19:35\",\"c4T1\":\"天津权健\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/quanjian/?cre=360.ala.zc.sc\",\"c4R\":\"0-3\",\"c4T2\":\"河北华夏幸福\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/huaxia/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"全场战报\",\"c52Link\":\"http://sports.sina.com.cn/china/j/2018-04-28/doc-ifzvpatq7483715.shtml?cre=360.ala.zc.sc\",\"liveid\":\"977267\"},{\"c1\":\"已结束\",\"c2\":\"04-29周日\",\"c3\":\"15:30\",\"c4T1\":\"长春亚泰\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/changchun/?cre=360.ala.zc.sc\",\"c4R\":\"2-1\",\"c4T2\":\"上海上港\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/eastasia/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"全场战报\",\"c52Link\":\"http://sports.sina.com.cn/china/j/2018-04-29/doc-ifzvpatr1308391.shtml?cre=360.ala.zc.sc\",\"liveid\":\"977268\"},{\"c1\":\"已结束\",\"c2\":\"04-29周日\",\"c3\":\"19:35\",\"c4T1\":\"北京国安\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/beijing/?cre=360.ala.zc.sc\",\"c4R\":\"4-3\",\"c4T2\":\"贵州恒丰\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/zhicheng/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"战报暂无\",\"c52Link\":\"\",\"liveid\":\"977271\"},{\"c1\":\"已结束\",\"c2\":\"04-29周日\",\"c3\":\"19:35\",\"c4T1\":\"重庆斯威\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/lifan/?cre=360.ala.zc.sc\",\"c4R\":\"0-1\",\"c4T2\":\"广州富力\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/fuli/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"全场战报\",\"c52Link\":\"http://sports.sina.com.cn/china/j/2018-04-29/doc-ifzvpatr2116984.shtml?cre=360.ala.zc.sc\",\"liveid\":\"977272\"},{\"c1\":\"已结束\",\"c2\":\"04-29周日\",\"c3\":\"19:35\",\"c4T1\":\"山东鲁能\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/shandong/?cre=360.ala.zc.sc\",\"c4R\":\"2-1\",\"c4T2\":\"河南建业\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/henan/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"全场战报\",\"c52Link\":\"http://sports.sina.com.cn/china/cfacup/2018-05-02/doc-ifzfkmth7725350.shtml?cre=360.ala.zc.sc\",\"liveid\":\"977269\"},{\"c1\":\"已结束\",\"c2\":\"04-29周日\",\"c3\":\"19:35\",\"c4T1\":\"上海申花\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/shanghai/?cre=360.ala.zc.sc\",\"c4R\":\"1-0\",\"c4T2\":\"大连一方\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/aerbin/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"战报暂无\",\"c52Link\":\"\",\"liveid\":\"977270\"}],\"saicheng2\":[{\"c1\":\"未开赛\",\"c2\":\"05-05周六\",\"c3\":\"15:00\",\"c4T1\":\"大连一方\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/aerbin/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"广州恒大\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/guangzhou/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176941\",\"liveid\":\"977273\"},{\"c1\":\"未开赛\",\"c2\":\"05-05周六\",\"c3\":\"19:35\",\"c4T1\":\"重庆斯威\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/lifan/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"天津权健\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/quanjian/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176940\",\"liveid\":\"977276\"},{\"c1\":\"未开赛\",\"c2\":\"05-05周六\",\"c3\":\"19:35\",\"c4T1\":\"广州富力\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/fuli/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"上海申花\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/shanghai/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176942\",\"liveid\":\"977274\"},{\"c1\":\"未开赛\",\"c2\":\"05-05周六\",\"c3\":\"19:35\",\"c4T1\":\"河北华夏幸福\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/huaxia/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"河南建业\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/henan/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176943\",\"liveid\":\"977275\"},{\"c1\":\"未开赛\",\"c2\":\"05-05周六\",\"c3\":\"19:35\",\"c4T1\":\"上海上港\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/eastasia/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"北京国安\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/beijing/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176944\",\"liveid\":\"977277\"},{\"c1\":\"未开赛\",\"c2\":\"05-06周日\",\"c3\":\"15:30\",\"c4T1\":\"北京人和\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/renhe/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"山东鲁能\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/shandong/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176945\",\"liveid\":\"977278\"},{\"c1\":\"未开赛\",\"c2\":\"05-06周日\",\"c3\":\"15:30\",\"c4T1\":\"天津泰达\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/tianjin/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"贵州恒丰\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/zhicheng/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176947\",\"liveid\":\"977279\"},{\"c1\":\"未开赛\",\"c2\":\"05-06周日\",\"c3\":\"19:35\",\"c4T1\":\"江苏苏宁\",\"c4T1URL\":\"http://sports.sina.com.cn/csl/jiangsu/?cre=360.ala.zc.sc\",\"c4R\":\"VS\",\"c4T2\":\"长春亚泰\",\"c4T2URL\":\"http://sports.sina.com.cn/csl/changchun/?cre=360.ala.zc.sc\",\"c51\":\"视频暂无\",\"c51Link\":\"\",\"c52\":\"图文直播\",\"c52Link\":\"http://match.sports.sina.com.cn/livecast/n/live.php?id=176946\",\"liveid\":\"977280\"}],\"saicheng3\":null,\"jifenbang\":[{\"c1\":\"1\",\"c2\":\"上海上港\",\"c2L\":\"http://sports.sina.com.cn/csl/eastasia/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"6\",\"c42\":\"1\",\"c43\":\"1\",\"c5\":\"16\",\"c6\":\"19\"},{\"c1\":\"2\",\"c2\":\"山东鲁能\",\"c2L\":\"http://sports.sina.com.cn/csl/shandong/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"6\",\"c42\":\"0\",\"c43\":\"2\",\"c5\":\"8\",\"c6\":\"18\"},{\"c1\":\"3\",\"c2\":\"广州恒大\",\"c2L\":\"http://sports.sina.com.cn/csl/guangzhou/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"5\",\"c42\":\"2\",\"c43\":\"1\",\"c5\":\"8\",\"c6\":\"17\"},{\"c1\":\"4\",\"c2\":\"北京国安\",\"c2L\":\"http://sports.sina.com.cn/csl/beijing/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"4\",\"c42\":\"3\",\"c43\":\"1\",\"c5\":\"6\",\"c6\":\"15\"},{\"c1\":\"5\",\"c2\":\"上海申花\",\"c2L\":\"http://sports.sina.com.cn/csl/shanghai/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"4\",\"c42\":\"2\",\"c43\":\"2\",\"c5\":\"0\",\"c6\":\"14\"},{\"c1\":\"6\",\"c2\":\"江苏苏宁\",\"c2L\":\"http://sports.sina.com.cn/csl/jiangsu/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"4\",\"c42\":\"1\",\"c43\":\"3\",\"c5\":\"4\",\"c6\":\"13\"},{\"c1\":\"7\",\"c2\":\"广州富力\",\"c2L\":\"http://sports.sina.com.cn/csl/fuli/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"4\",\"c42\":\"0\",\"c43\":\"4\",\"c5\":\"-3\",\"c6\":\"12\"},{\"c1\":\"8\",\"c2\":\"重庆斯威\",\"c2L\":\"http://sports.sina.com.cn/csl/lifan/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"3\",\"c42\":\"2\",\"c43\":\"3\",\"c5\":\"2\",\"c6\":\"11\"},{\"c1\":\"9\",\"c2\":\"长春亚泰\",\"c2L\":\"http://sports.sina.com.cn/csl/changchun/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"3\",\"c42\":\"2\",\"c43\":\"3\",\"c5\":\"0\",\"c6\":\"11\"},{\"c1\":\"10\",\"c2\":\"河北华夏\",\"c2L\":\"http://sports.sina.com.cn/csl/huaxia/?cre=360.ala.zc.sc\",\"c3\":\"8\",\"c41\":\"3\",\"c42\":\"2\",\"c43\":\"3\",\"c5\":\"0\",\"c6\":\"11\"}],\"sheshoubang\":[{\"c1\":\"1\",\"c2\":\"武磊\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=116730\",\"c3\":\"上海上港\",\"c3L\":\"http://sports.sina.com.cn/csl/eastasia/?cre=360.ala.zc.sc\",\"c4\":\"11\",\"c5\":\"0\"},{\"c1\":\"2\",\"c2\":\"塔尔德利\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=28527\",\"c3\":\"山东鲁能\",\"c3L\":\"http://sports.sina.com.cn/csl/shandong/?cre=360.ala.zc.sc\",\"c4\":\"8\",\"c5\":\"1\"},{\"c1\":\"3\",\"c2\":\"伊格哈罗\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=58498\",\"c3\":\"长春亚泰\",\"c3L\":\"http://sports.sina.com.cn/csl/changchun/?cre=360.ala.zc.sc\",\"c4\":\"8\",\"c5\":\"1\"},{\"c1\":\"4\",\"c2\":\"扎哈维\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=56838\",\"c3\":\"广州富力\",\"c3L\":\"http://sports.sina.com.cn/csl/fuli/?cre=360.ala.zc.sc\",\"c4\":\"6\",\"c5\":\"0\"},{\"c1\":\"5\",\"c2\":\"拉维齐\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=45154\",\"c3\":\"河北华夏\",\"c3L\":\"http://sports.sina.com.cn/csl/huaxia/?cre=360.ala.zc.sc\",\"c4\":\"6\",\"c5\":\"0\"},{\"c1\":\"6\",\"c2\":\"阿兰\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=51565\",\"c3\":\"广州恒大\",\"c3L\":\"http://sports.sina.com.cn/csl/guangzhou/?cre=360.ala.zc.sc\",\"c4\":\"6\",\"c5\":\"0\"},{\"c1\":\"7\",\"c2\":\"特拉沃利\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=202915\",\"c3\":\"贵州恒丰\",\"c3L\":\"http://sports.sina.com.cn/csl/zhicheng/?cre=360.ala.zc.sc\",\"c4\":\"6\",\"c5\":\"0\"},{\"c1\":\"8\",\"c2\":\"阿切安庞\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=153460\",\"c3\":\"天津泰达\",\"c3L\":\"http://sports.sina.com.cn/csl/tianjin/?cre=360.ala.zc.sc\",\"c4\":\"5\",\"c5\":\"0\"},{\"c1\":\"9\",\"c2\":\"高拉特\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=61622\",\"c3\":\"广州恒大\",\"c3L\":\"http://sports.sina.com.cn/csl/guangzhou/?cre=360.ala.zc.sc\",\"c4\":\"5\",\"c5\":\"1\"},{\"c1\":\"10\",\"c2\":\"特谢拉\",\"c2L\":\"http://match.sports.sina.com.cn/football/csl/player.php?id=52304\",\"c3\":\"江苏苏宁\",\"c3L\":\"http://sports.sina.com.cn/csl/jiangsu/?cre=360.ala.zc.sc\",\"c4\":\"5\",\"c5\":\"1\"}]}},\"error_code\":0}";
//		JSONObject obj = JSON.parseObject(str).getJSONObject("result").getJSONObject("views");
//		String saicheng1 = obj.getString("saicheng1");
//		String saicheng2 = obj.getString("saicheng2");
//		String saicheng3 = obj.getString("saicheng3");
//		List<Saichenginfo> list1 = new ArrayList<Saichenginfo>();
//		List<Saichenginfo> list2 = new ArrayList<Saichenginfo>();
//		List<Saichenginfo> list3 = new ArrayList<Saichenginfo>();
//		if(StringUtils.isNotBlank(saicheng1)){
//			list1 = JSON.parseArray(saicheng1, Saichenginfo.class);
//		}
//		if(StringUtils.isNotBlank(saicheng2)){
//			list2 = JSON.parseArray(saicheng2, Saichenginfo.class);
//			list1.addAll(list2);
//		}
//		if(StringUtils.isNotBlank(saicheng3)){
//			list3 = JSON.parseArray(saicheng3, Saichenginfo.class);
//			list1.addAll(list3);
//		}
//		System.out.println(list1.size());
////		for (Saichenginfo saichenginfo : list1) {
////			System.out.println(saichenginfo.getC1());
////			System.out.println(saichenginfo.getC2());
////			System.out.println(saichenginfo.getC3());
////			System.out.println(saichenginfo.getC4R());
////			System.out.println(saichenginfo.getC4T1());
////			System.out.println(saichenginfo.getC4T1URL());
////			System.out.println(saichenginfo.getC4T2());
////			System.out.println(saichenginfo.getC4T2URL());
////			System.out.println(saichenginfo.getC51());
////			System.out.println(saichenginfo.getC51Link());
////			System.out.println(saichenginfo.getC52());
////			System.out.println(saichenginfo.getC52Link());
////			System.out.println(saichenginfo.getLiveid());
////			System.out.println("-----------------------------");
////		}
//	}
	
}
