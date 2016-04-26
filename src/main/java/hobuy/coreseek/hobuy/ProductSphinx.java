package hobuy.coreseek.hobuy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hobuy.coreseek.SphinxClient;
import hobuy.coreseek.SphinxMatch;
import hobuy.coreseek.SphinxResult;

public class ProductSphinx {
	private String sphinxHost = "127.0.0.1";
	private int sphinxPort = 9312;
	private SphinxClient sphinxClient = new SphinxClient(sphinxHost, sphinxPort);

	public ProductSphinx(String sphinxHost, int sphinxPort) {
		super();
		this.sphinxHost = sphinxHost;
		this.sphinxPort = sphinxPort;
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ProductSphinx() {
		try {
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void init() throws Exception {
		sphinxClient.SetMatchMode(sphinxClient.SPH_MATCH_ANY);
		sphinxClient.SetConnectTimeout(5000);
		Map<String, Integer> fieldWeights = new HashMap<String, Integer>();
		fieldWeights.put("name", 100);
		fieldWeights.put("subtitle", 30);
		fieldWeights.put("introduce", 60);
		sphinxClient.SetFieldWeights(fieldWeights);
		System.out.println("coreseek初始化成功");
	}

	public List<Long> query(String word, int start, int count) throws Exception {

		sphinxClient.SetLimits(start, count);
		System.out.println(word);
		SphinxResult result = sphinxClient.Query(word, "hobuy,hbdelta");// 第二个参数是索引，是。conf下配置的索引index
		List<Long> list = new ArrayList<Long>();
		try {
			SphinxMatch[] match = result.matches;
			for (SphinxMatch sphinxMatch : match) {
				list.add(Long.parseLong(sphinxMatch.docId + ""));
			}
		} catch (Exception e) {
			return null;
		}
		return list;
	}

	// public List<Integer> query(String word, int start, int count, Map<String,
	// Integer> filesWeightMap)
	// throws Exception {
	// sphinxClient.SetFieldWeights(filesWeightMap);
	// return query(word, start, count);
	// }

}
