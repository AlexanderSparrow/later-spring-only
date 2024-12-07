package ru.practicum.item;

import java.util.List;

interface ItemService {
    List<Item> getAllItems(long userId);

    Item addNewItem (long userId, Item item);

    void deleteItem(long userId, long itemId);
}
