package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PlateInfoForYiCai;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.quotation.plate.index.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-25 20:20:00
 */
public class AntfortuneQuotationPlateIndexQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7418565722858674751L;

	/** 
	 * 用于返回板块的信息
	 */
	@ApiListField("plate_list")
	@ApiField("plate_info_for_yi_cai")
	private List<PlateInfoForYiCai> plateList;

	/** 
	 * 板块数据
	 */
	@ApiField("res")
	private String res;

	public void setPlateList(List<PlateInfoForYiCai> plateList) {
		this.plateList = plateList;
	}
	public List<PlateInfoForYiCai> getPlateList( ) {
		return this.plateList;
	}

	public void setRes(String res) {
		this.res = res;
	}
	public String getRes( ) {
		return this.res;
	}

}