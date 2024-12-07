package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {
    List<Item> items = new ArrayList<>();

    @Override
    public List<Item> findByUserId(long userId) {
        return items;
    }

    @Override
    public Item save(long userId, Item item) {
        item.setId(getId());
        item.setUserId(userId);
        items.add(item);
        return item;

    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        items.removeIf(item -> (item.getUserId() == userId && item.getId() == itemId));
    }

    private long getId() {
        long lastId = items.stream()
                .mapToLong(Item::getId)
                .max()
                .orElse(0);
        return lastId + 1;
    }
}
