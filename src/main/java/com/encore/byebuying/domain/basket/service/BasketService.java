package com.encore.byebuying.domain.basket.service;

import com.encore.byebuying.domain.basket.dto.CreateBasketItemDTO;
import com.encore.byebuying.domain.basket.dto.DeleteBasketItemListDTO;
import com.encore.byebuying.domain.basket.dto.SearchBasketItemListDTO;
import com.encore.byebuying.domain.basket.dto.UpdateBasketItemDTO;
import com.encore.byebuying.domain.basket.repository.BasketItemRepository;
import com.encore.byebuying.domain.basket.repository.BasketRepository;
import com.encore.byebuying.domain.basket.service.vo.BasketItemVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class BasketService {

    private final BasketRepository basketRepository;
    private final BasketItemRepository basketItemRepository;

    public Page<BasketItemVO> getBasketItemList(SearchBasketItemListDTO dto) {
        return null;
    }

    public void createBasketItem(CreateBasketItemDTO dto) {

    }

    public void updateBasketItemCount(UpdateBasketItemDTO dto, Long basketItemId) {

    }

    public void deleteBasketItemList(DeleteBasketItemListDTO dto) {

    }

}
