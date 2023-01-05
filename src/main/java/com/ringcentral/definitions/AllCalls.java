package com.ringcentral.definitions;


    /**
* Data for all calls
*/
public class AllCalls
{
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AllCalls valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Value for all calls
     * Required
     * Format: double
     */
    public Double values;
    public AllCalls values(Double values)
    {
        this.values = values;
        return this;
    }
}