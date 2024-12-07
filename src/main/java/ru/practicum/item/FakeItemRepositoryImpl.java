package ru.practicum.item;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//@Repository
@RequiredArgsConstructor
public class FakeItemRepositoryImpl implements ItemRepository {
    private static final List<Item> FAKE_ITEMS = createManyFakeItems(10);

    private static List<Item> createManyFakeItems(int count) {
        List<Item> fakeItems = new ArrayList<>();
        for (long id = 1; id <= count; id++) {
            fakeItems.add(createFakeItem(id, 1));
        }
        return fakeItems;
    }

    private static Item createFakeItem(long itemId, long userId) {
        Item fakeItem = new Item();
        fakeItem.setId(itemId);
        fakeItem.setUserId(userId);
        fakeItem.setUrl("https://fake_url_#" + itemId + "_for_user_#" + userId);
        return fakeItem;
    }

    @Override
    public List<Item> findByUserId(long userId) {
        return FAKE_ITEMS;
    }

    @Override
    public Item save(long userId, Item item) {
        return null;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        throw new UnsupportedOperationException("Метод deleteByUserIdAndItemId() еще не готов.");
    }
}
