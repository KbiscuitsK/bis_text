package nxu.it.movieapi.controller;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.ApiResult;
import nxu.it.api.common.result.Pageable;
import nxu.it.movieapi.eneity.Product;
import nxu.it.movieapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/manage")
public class MainApiController {

    @Autowired
    ProductService productService;

    /**
     * 分页查询产品信息
     * @param pageQueryParam
     * @return
     */
    @PostMapping("/products")
    public ApiResult<Pageable<Product>> getProduct(@RequestBody  PageQueryParam pageQueryParam) {
        Pageable<Product> products = productService.page(pageQueryParam);
        return ApiResult.success(products);
    }

    /**
     * 按产品ID查询产品信息
     * @param id
     * @return
     */
    @GetMapping("/prodcut/{id}")
    public ApiResult<Optional<Product>> getProduct(@PathVariable Integer id) {
        Optional<Product> product = productService.pageById(id);
        return ApiResult.success(product);
    }



}
