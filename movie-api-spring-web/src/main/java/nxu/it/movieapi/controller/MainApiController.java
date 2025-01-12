package nxu.it.movieapi.controller;

import nxu.it.api.common.param.PageQueryParam;
import nxu.it.api.common.result.ApiResult;
import nxu.it.api.common.result.Pageable;
import nxu.it.api.model.Author;
import nxu.it.movieapi.eneity.*;
import nxu.it.movieapi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manage")
public class MainApiController {

    @Autowired
    ProductService productService;
    @Autowired
    CustomerService customerService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    SupplierService supplierService;
    @Autowired
    ShipperService shipperService;
    @Autowired
    OrderService orderService;
    @Autowired
    AuthorService authorService;

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
    @GetMapping("/product/{id}")
    public ApiResult<Optional<Product>> getProduct(@PathVariable Integer id) {
        Optional<Product> product = productService.pageById(id);
        return ApiResult.success(product);
    }

    /**
     * 分页查询用户信息
     * @param param
     * @return
     */
    @PostMapping("/customers")
    public ApiResult<Pageable<Customer>> getCustomers(@RequestBody PageQueryParam param) {
        Pageable<Customer> page = customerService.page(param);
        return ApiResult.success(page);
    }

    /**
     * 分页查询员工信息
     * @param param
     * @return
     */
    @PostMapping("/employees")
    public ApiResult<Pageable<Employee>> getEmployees(@RequestBody PageQueryParam param) {
        Pageable<Employee> page = employeeService.page(param);
        return ApiResult.success(page);
    }

    /**
     * 分页查询供应商信息
     * @param param
     * @return
     */
    @PostMapping("/suppliers")
    public ApiResult<Pageable<Supplier>> getSuppliers(@RequestBody PageQueryParam param) {
        Pageable<Supplier> page = supplierService.page(param);
        return ApiResult.success(page);
    }

    /**
     * 分页查询运货商信息
     * @param param
     * @return
     */
    @PostMapping("/shippers")
    public ApiResult<Pageable<Shipper>> getShippers(@RequestBody PageQueryParam param) {
        Pageable<Shipper> page = shipperService.page(param);
        return ApiResult.success(page);
    }

    /**
     *分页查询订单信息
     * @param param
     * @return
     */
    @PostMapping("/orders")
    public ApiResult<Pageable<Order>> getOrders(@RequestBody PageQueryParam param) {
        Pageable<Order> page = orderService.page(param);
        return ApiResult.success(page);
    }

    /**
     * 按ID查询订单信息
     * @param id
     * @return
     */
    @GetMapping("/order/{id}")
    public ApiResult<Optional<Order>> getOrders(@PathVariable String id) {
        Optional<Order> page = orderService.pageById(id);
        return ApiResult.success(page);
    }

    @GetMapping("/authors")
    public ApiResult<List<Author>> getAuthors() {
        List<Author> page =authorService.findAll();
        return ApiResult.success(page);
    }

}
