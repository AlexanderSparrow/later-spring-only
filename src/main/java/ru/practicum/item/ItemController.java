package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public List<Item> getAllItems(@RequestHeader("X-Later-User-Id") long userId) {
        return itemService.getAllItems(userId);
    }

    @PostMapping
    public Item addNewItem(@RequestHeader("X-Later-User-Id") long userId,
                        @RequestBody Item item) {
        return itemService.addNewItem(userId, item);
    }

    @DeleteMapping ("/{itemId}")
    public void deleteItem (@RequestHeader("X-Later-User-Id") long userId,
                            @PathVariable(name="itemId") long itemId) {
        itemService.deleteItem(userId, itemId);
    }
}
