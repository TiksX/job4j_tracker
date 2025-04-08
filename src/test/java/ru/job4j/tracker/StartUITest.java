package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

    class StartUITest {
        @Test
        void whenCreateItem() {
            Input input = new MockInput(
                    new String[] {"0", "Item name", "1"}
            );
            Tracker tracker = new Tracker();
            UserAction[] actions = {
                    new CreateAction(),
                    new ExitAction()
            };
            new StartUI().init(input, tracker, actions);
            assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
        }

        @Test
        void whenReplaceItem() {
            Tracker tracker = new Tracker();
            Item item = tracker.createItem(new Item("Replaced item"));
            String replacedName = "New item name";
            Input input = new MockInput(
                    new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
            );
            UserAction[] actions = {
                    new ReplaceAction(),
                    new ExitAction()
            };
            new StartUI().init(input, tracker, actions);
            assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
        }

        @Test
        void whenDeleteItem() {
            Tracker tracker = new Tracker();
            Item item = tracker.createItem(new Item("Deleted item")); /* Добавляется в tracker новая заявка */
            Input input = new MockInput(
                    new String[] {"0", String.valueOf(item.getId()), "1"}
            );
            UserAction[] actions = {
                    new DeleteAction(),
                    new ExitAction(output)
            };
            new StartUI().init(input, tracker, actions);
            assertThat(tracker.findById(item.getId())).isNull();
        }

        @Test
        void whenExit() {
            Output output = new StubOutput();
            Input input = new MockInput(
                    new String[] {"0"}
            );
            Tracker tracker = new Tracker();
            UserAction[] actions = {
                    new ExitAction(output)
            };
            new StartUI(output).init(input, tracker, actions);
            assertThat(output.toString()).isEqualTo(
                    "Меню:" + System.lineSeparator()
                            + "0. Завершить программу" + System.lineSeparator()
                            + "=== Завершение программы ===" + System.lineSeparator()
            );
        }
    }