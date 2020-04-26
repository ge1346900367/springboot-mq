package abc.qwe.com.springbootmq.controller;

import abc.qwe.com.springbootmq.utils.JsonResult;
import abc.qwe.com.springbootmq.utils.RusultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@Api("客服接口")
@RestController
@RequestMapping("/checkcenter")
public class CheckCenterController {



    @ApiOperation(value="获取客服", notes="根据cid获取客服")
    @ApiImplicitParam(name = "cid", value = "客户id", required = true, dataType = "String")
    @ResponseBody
    @GetMapping("/getCenter")
    public RusultObject getCenter(String cid) {
        Map<String,String> map=new LinkedHashMap<String,String>();
        map.put("cid",cid);
        map.put("name","客服");
        return new RusultObject("1231465464","user");
    }


    @ApiOperation(value="获取客服", notes="根据cid获取客服")
    @ApiImplicitParam(name = "cid", value = "客户id", required = true, dataType = "String")
    @ResponseBody
    @PostMapping("/getCenter/{cid}")
    public JsonResult getCenter2(@PathVariable String cid) {
        Map<String,String> map=new LinkedHashMap<String,String>();
        map.put("cid",cid);
        map.put("name","客服");
        return new JsonResult("12","as");
    }






}
