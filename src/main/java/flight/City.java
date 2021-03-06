package flight;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum City {
	阿勒泰("AAT"), 哈尔滨("HRB"), 安康("AKA"), 和田("HTN"), 沙市("SHS"), 阿克苏("AKU"), 汉中(
			"HZG"), 西安("SIA"), 安庆("AQC"), 银川("INC"), 汕头("SWA"), 包头("BAV"), 且末(
			"IQM"), 深圳("SZX"), 北京("BJS"), 庆阳("IQN"), 思茅("SYM"), 北海("BHY"), 景德镇(
			"JDZ"), 三亚("SYX"), 保山("BSD"), 嘉峪关("JGN"), 青岛("TAO"), 广州("CAN"), 九江(
			"JIU"), 铜仁("TEN"), 常德("CGD"), 晋江("JJN"), 辽通("TGO"), 郑州("CGO"), 佳木斯(
			"JMU"), 济南("TNA"), 长春("CGQ"), 库车("KCA"), 天津("TSN"), 朝阳("CHG"), 喀什(
			"KHG"), 屯溪("TXN"), 酒泉("CHW"), 南昌("KHN"), 太原("TYN"), 赤峰("CIF"), 昆明(
			"KMG"), 乌鲁木齐("URC"), 长治("CIH"), 吉安("KNC"), 榆林("UYN"), 重庆("CKG"), 赣州(
			"KOW"), 武汉("WUH"), 长海("CNI"), 库尔勒("KRL"), 万县("WXN"), 长沙("CSX"), 克拉玛依(
			"KRY"), 兴城("XEN"), 成都("CTU"), 贵阳("KWE"), 襄樊("XFN"), 常州("CZX"), 桂林(
			"KWL"), 西昌("XIC"), 大同("DAT"), 梁平("LIA"), 锡林浩特("XIL"), 达县("DAX"), 兰州(
			"LHW"), 咸阳机场_西安("XIY"), 丹东("DDG"), 庐山("LUZ"), 兴宁("XIN"), 大连("DLX"), 拉萨(
			"LXA"), 厦门("XMN"), 敦煌("DNH"), 林西("LXI"), 西宁("XNN"), 大庸("DYG"), 连云港(
			"LYG"), 徐州("XUZ"), 恩施("ENH"), 洛阳("LYA"), 宜昌("YIH"), 延安("ENY"), 临沂(
			"LYI"), 伊宁("YIN"), 福州("FOC"), 兰州东("LZD"), 烟台("YNT"), 阜阳("FUG"), 柳州(
			"LZH"), 依兰("YLN"), 富蕴("FYN"), 牡丹江("MOG"), 延吉("YNJ"), 格尔木("GOQ"), 梅县(
			"MXZ"), 昭通("ZAT"), 广汉("GHN"), 南充("NAO"), 中川机场_兰州("ZGC"), 海口("HAK"), 齐齐哈尔(
			"NDG"), 湛江("ZHA"), 黑河("HEK"), 宁波("NGB"), 珠海("ZUH"), 呼和浩特("HET"), 南京(
			"NKG"), 合肥("HFE"), 南宁("NNG"), 杭州("HGH"), 南阳("NNY"), 黄花机场_长沙("HHA"), 首都机场_北京(
			"PEK"), 海拉尔("HLD"), 上海浦东("PVG"), 乌兰浩特("HLH"), 上海("SHA"), 哈密("HMI"), 沈阳(
			"SHE"), 衡阳("HNY"), 山海关("SHP");
	private String cityCode;
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
		
	}
	private City(String cityCode) {
		this.cityCode = cityCode;
	}
	public static List<City> cities = new ArrayList<City>();
	static {
		for (City city: EnumSet.allOf(City.class)) {
			cities.add(city);
		}
	}

}
