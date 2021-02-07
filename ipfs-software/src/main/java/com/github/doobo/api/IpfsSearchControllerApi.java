package com.github.doobo.api;

import com.github.doobo.model.IpfsFileInfo;
import com.github.doobo.model.SearchVO;
import com.github.doobo.params.ResultTemplate;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * ipfs文件搜索相关API
 */
public interface IpfsSearchControllerApi {

	/**
	 * 保存文档信息
	 * @param fileInfo
	 */
	@PostMapping("ipfs/save")
	ResultTemplate<Boolean> saveFileInfo(IpfsFileInfo fileInfo);

	/**
	 * 文件搜索
	 * @param vo
	 * @return
	 */
	@PostMapping("ipfs/search")
	ResultTemplate<List<IpfsFileInfo>> search(SearchVO vo);
}
