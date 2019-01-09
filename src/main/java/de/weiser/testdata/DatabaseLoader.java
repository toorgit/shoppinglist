package de.weiser.testdata;

import de.weiser.model.Store;
import de.weiser.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final StoreRepository stores;

	@Autowired
	public DatabaseLoader(StoreRepository storeRepository) {

		this.stores = storeRepository;
	}

	@Override
	public void run(String... strings) throws Exception {

		Store aldi = this.stores.save(new Store("aldi", "Mein Aldi"));
		Store dm = this.stores.save(new Store("dm", "Mein dm"));
		Store lidl = this.stores.save(new Store("Lidl", "Mein lidl"));


	}
}