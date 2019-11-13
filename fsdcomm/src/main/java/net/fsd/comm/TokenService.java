package net.fsd.comm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service(value = "tokenService")
@FeignClient(value = "fsdsecurity",  configuration = {FeignTokenInterceptor.class})
public interface TokenService {
	@RequestMapping(value = "/auth/allowaccess", method = RequestMethod.POST)
	public boolean allowaccess();
}
