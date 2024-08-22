package ASAC8._SpringPractice.newproduct.repository;

import ASAC8._SpringPractice.item.Item;

import java.util.List;

public interface Repository {
    public abstract List<Item> getAllItems();
}
