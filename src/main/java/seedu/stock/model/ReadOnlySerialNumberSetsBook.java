package seedu.stock.model;

import javafx.collections.ObservableList;
import seedu.stock.model.stock.SerialNumberSet;
import seedu.stock.model.stock.Stock;

/**
 * Unmodifiable view of an stock book
 */
public interface ReadOnlySerialNumberSetsBook {

    /**
     * Returns an unmodifiable view of the serial number sets list.
     * This list will not contain any duplicate serial number set.
     */
    ObservableList<SerialNumberSet> getSerialNumberSetsList();

}
