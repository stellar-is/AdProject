package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.Discounts;
import com.stellar.myproject.entity.dto.DiscountsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface DiscountsMapper {
    DiscountsMapper INSTANCE = Mappers.getMapper(DiscountsMapper.class);
    DiscountsDto discountsToDiscountsDto(Discounts discounts);
    Discounts discountsDtoToDiscounts(DiscountsDto discountsDto);
    List<DiscountsDto>discountsListToDiscountsDtoList(List<Discounts>discountsList);
    List<Discounts>discountsDtoListToDiscountsList(List<DiscountsDto>discountsDtoList);

}
