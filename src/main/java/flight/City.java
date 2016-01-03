package flight;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public enum City {
	����̩("AAT"), ������("HRB"), ����("AKA"), ����("HTN"), ɳ��("SHS"), ������("AKU"), ����(
			"HZG"), ����("SIA"), ����("AQC"), ����("INC"), ��ͷ("SWA"), ��ͷ("BAV"), ��ĩ(
			"IQM"), ����("SZX"), ����("BJS"), ����("IQN"), ˼é("SYM"), ����("BHY"), ������(
			"JDZ"), ����("SYX"), ��ɽ("BSD"), ������("JGN"), �ൺ("TAO"), ����("CAN"), �Ž�(
			"JIU"), ͭ��("TEN"), ����("CGD"), ����("JJN"), ��ͨ("TGO"), ֣��("CGO"), ��ľ˹(
			"JMU"), ����("TNA"), ����("CGQ"), �⳵("KCA"), ���("TSN"), ����("CHG"), ��ʲ(
			"KHG"), ��Ϫ("TXN"), ��Ȫ("CHW"), �ϲ�("KHN"), ̫ԭ("TYN"), ���("CIF"), ����(
			"KMG"), ��³ľ��("URC"), ����("CIH"), ����("KNC"), ����("UYN"), ����("CKG"), ����(
			"KOW"), �人("WUH"), ����("CNI"), �����("KRL"), ����("WXN"), ��ɳ("CSX"), ��������(
			"KRY"), �˳�("XEN"), �ɶ�("CTU"), ����("KWE"), �差("XFN"), ����("CZX"), ����(
			"KWL"), ����("XIC"), ��ͬ("DAT"), ��ƽ("LIA"), ���ֺ���("XIL"), ����("DAX"), ����(
			"LHW"), ��������_����("XIY"), ����("DDG"), ®ɽ("LUZ"), ����("XIN"), ����("DLX"), ����(
			"LXA"), ����("XMN"), �ػ�("DNH"), ����("LXI"), ����("XNN"), ��ӹ("DYG"), ���Ƹ�(
			"LYG"), ����("XUZ"), ��ʩ("ENH"), ����("LYA"), �˲�("YIH"), �Ӱ�("ENY"), ����(
			"LYI"), ����("YIN"), ����("FOC"), ���ݶ�("LZD"), ��̨("YNT"), ����("FUG"), ����(
			"LZH"), ����("YLN"), ����("FYN"), ĵ����("MOG"), �Ӽ�("YNJ"), ���ľ("GOQ"), ÷��(
			"MXZ"), ��ͨ("ZAT"), �㺺("GHN"), �ϳ�("NAO"), �д�����_����("ZGC"), ����("HAK"), �������(
			"NDG"), տ��("ZHA"), �ں�("HEK"), ����("NGB"), �麣("ZUH"), ���ͺ���("HET"), �Ͼ�(
			"NKG"), �Ϸ�("HFE"), ����("NNG"), ����("HGH"), ����("NNY"), �ƻ�����_��ɳ("HHA"), �׶�����_����(
			"PEK"), ������("HLD"), �Ϻ��ֶ�("PVG"), ��������("HLH"), �Ϻ�("SHA"), ����("HMI"), ����(
			"SHE"), ����("HNY"), ɽ����("SHP");
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
