package com.ringcentral.definitions;


    /**
* Information on paging
*/
public class ProvisioningPagingInfo
{
    /**
     * Current page number. 1-indexed, so the first page is 1
    * by default. May be omitted if result is empty (because non-existent page
    * was specified or perPage=0 was requested)
     * Format: int32
     */
    public Long page;
    public ProvisioningPagingInfo page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Current page size, describes how many items are in each page.
    * Default value is 100. Maximum value is 1000. If perPage value in the request
    * is greater than 1000, the maximum value (1000) is applied
     * Format: int32
     */
    public Long perPage;
    public ProvisioningPagingInfo perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * The zero-based number of the first element on the current page.
    * Omitted if the page is omitted or result is empty
     * Format: int32
     */
    public Long pageStart;
    public ProvisioningPagingInfo pageStart(Long pageStart)
    {
        this.pageStart = pageStart;
        return this;
    }

    /**
     * The zero-based index of the last element on the current page.
    * Omitted if the page is omitted or result is empty
     * Format: int32
     */
    public Long pageEnd;
    public ProvisioningPagingInfo pageEnd(Long pageEnd)
    {
        this.pageEnd = pageEnd;
        return this;
    }

    /**
     * The total number of pages in a dataset. May be omitted for
    * some resources due to performance reasons
     * Format: int32
     */
    public Long totalPages;
    public ProvisioningPagingInfo totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * The total number of elements in a dataset. May be omitted for
    * some resource due to performance reasons
     * Format: int32
     */
    public Long totalElements;
    public ProvisioningPagingInfo totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }
}