package one.dio.projetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import one.dio.projetospring.model.Endereco;

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepServide {
    //@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    @GetMapping("/{cep}/json")
    Endereco consultaCep(@PathVariable("cep") String cep);    
}
