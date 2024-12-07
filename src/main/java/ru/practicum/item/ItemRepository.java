package ru.practicum.item;

import java.util.List;

interface ItemRepository {
    List<Item> findByUserId(long userId);

    Item save(long userId, Item item);

    void deleteByUserIdAndItemId(long userId, long itemId);
}

