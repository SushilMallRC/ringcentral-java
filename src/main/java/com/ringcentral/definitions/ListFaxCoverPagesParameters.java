package com.ringcentral.definitions;


/**
 * Query parameters for operation listFaxCoverPages
 */
public class ListFaxCoverPagesParameters {
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;

    public ListFaxCoverPagesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListFaxCoverPagesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
