package com.itguigu.zcw.web.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.itguigu.zcw.commons.bean.TAdvertisement;
import com.itguigu.zcw.commons.vo.resp.AppResponse;
import com.itguigu.zcw.commons.vo.resp.IndexRecommendRespVo;
import com.itguigu.zcw.commons.vo.resp.ReturnPayConfirmRespVo;
import com.itguigu.zcw.web.exception.TProjectServiceFeignExceptionHandler;
import com.itguigu.zcw.web.vo.req.ProjectDetailRepVo;

@FeignClient(value = "SCW-PROJECT", fallback = TProjectServiceFeignExceptionHandler.class)
public interface TProjectServiceFeign {
	/**
	 * 首页推荐
	 * @return
	 */
	@GetMapping("/project/recommend/index")
	public AppResponse<List<IndexRecommendRespVo>> indexRecommend();
	
	/**
	 * 首页广告
	 * @return
	 */
	@GetMapping("/project/adv")
	public AppResponse<List<TAdvertisement>> adv();
	
	/**
	 * 项目详情
	 * @param projectId
	 * @return
	 */
	@GetMapping("/project/info/detail/{projectId}")
	public AppResponse<ProjectDetailRepVo> detail(@PathVariable("projectId") Integer projectId);
	
	/**
	 * 回报页面数据回显
	 * @param projectId
	 * @param returnId
	 * @return
	 */
	@GetMapping("/project/confirm/return/{projectId}/{returnId}")
	public AppResponse<ReturnPayConfirmRespVo> confirmReturn(@PathVariable("projectId")Integer projectId,  @PathVariable("returnId")Integer returnId);
}
