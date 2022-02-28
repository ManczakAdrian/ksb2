package pl.manczak.ksb2;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("product")
public class ProductApi {
    @GetMapping("/products")
    public String getProduct(){
        return "Hello World with GET";




//    //PARAMETR
//    @GetMapping
//    public String getProducts(@RequestParam String name,@RequestParam(required = false,defaultValue = "") String surname){
//        return "Hello " + name+ ""+surname;

    }

    // PATH
//    @GetMapping("/{name}")
//    public String getProducts(@PathVariable String name) {
//        return "Hello " + name;
//
//    }

    //HEADER
//    @GetMapping
//  public String getProducts(@RequestHeader String name) {
//        return "Hello " + name;
//
//    }
//
    //BODY
//    @GetMapping
//    public String getProducts(@RequestBody String name) {
//        return "Hello " + name;

    //}


//    @GetMapping
//public String getProduct (@RequestParam String name,
//                          @RequestHeader(required = false, defaultValue = "")String surname){
//    return "Hello "+ name+ ""+surname;

//}


    @PostMapping("/products")
    public String addProduct(){
        return "Hello World with POST";

    }

    @PutMapping("/products")
    public String modProduct(){
        return "Hello World with PUT";

    }
    @DeleteMapping("/products")
    public String removeProduct(){
        return "Hello World with DELETE";

    }


}
