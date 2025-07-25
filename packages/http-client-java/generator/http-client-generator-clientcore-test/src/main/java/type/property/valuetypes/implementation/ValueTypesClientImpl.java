package type.property.valuetypes.implementation;

import io.clientcore.core.http.pipeline.HttpPipeline;
import io.clientcore.core.instrumentation.Instrumentation;

/**
 * Initializes a new instance of the ValueTypesClient type.
 */
public final class ValueTypesClientImpl {
    /**
     * Service host.
     */
    private final String endpoint;

    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The instance of instrumentation to report telemetry.
     */
    private final Instrumentation instrumentation;

    /**
     * Gets The instance of instrumentation to report telemetry.
     * 
     * @return the instrumentation value.
     */
    public Instrumentation getInstrumentation() {
        return this.instrumentation;
    }

    /**
     * The BooleanOperationsImpl object to access its operations.
     */
    private final BooleanOperationsImpl booleanOperations;

    /**
     * Gets the BooleanOperationsImpl object to access its operations.
     * 
     * @return the BooleanOperationsImpl object.
     */
    public BooleanOperationsImpl getBooleanOperations() {
        return this.booleanOperations;
    }

    /**
     * The StringOperationsImpl object to access its operations.
     */
    private final StringOperationsImpl stringOperations;

    /**
     * Gets the StringOperationsImpl object to access its operations.
     * 
     * @return the StringOperationsImpl object.
     */
    public StringOperationsImpl getStringOperations() {
        return this.stringOperations;
    }

    /**
     * The BytesImpl object to access its operations.
     */
    private final BytesImpl bytes;

    /**
     * Gets the BytesImpl object to access its operations.
     * 
     * @return the BytesImpl object.
     */
    public BytesImpl getBytes() {
        return this.bytes;
    }

    /**
     * The IntsImpl object to access its operations.
     */
    private final IntsImpl ints;

    /**
     * Gets the IntsImpl object to access its operations.
     * 
     * @return the IntsImpl object.
     */
    public IntsImpl getInts() {
        return this.ints;
    }

    /**
     * The FloatOperationsImpl object to access its operations.
     */
    private final FloatOperationsImpl floatOperations;

    /**
     * Gets the FloatOperationsImpl object to access its operations.
     * 
     * @return the FloatOperationsImpl object.
     */
    public FloatOperationsImpl getFloatOperations() {
        return this.floatOperations;
    }

    /**
     * The DecimalsImpl object to access its operations.
     */
    private final DecimalsImpl decimals;

    /**
     * Gets the DecimalsImpl object to access its operations.
     * 
     * @return the DecimalsImpl object.
     */
    public DecimalsImpl getDecimals() {
        return this.decimals;
    }

    /**
     * The Decimal128sImpl object to access its operations.
     */
    private final Decimal128sImpl decimal128s;

    /**
     * Gets the Decimal128sImpl object to access its operations.
     * 
     * @return the Decimal128sImpl object.
     */
    public Decimal128sImpl getDecimal128s() {
        return this.decimal128s;
    }

    /**
     * The DatetimeOperationsImpl object to access its operations.
     */
    private final DatetimeOperationsImpl datetimeOperations;

    /**
     * Gets the DatetimeOperationsImpl object to access its operations.
     * 
     * @return the DatetimeOperationsImpl object.
     */
    public DatetimeOperationsImpl getDatetimeOperations() {
        return this.datetimeOperations;
    }

    /**
     * The DurationOperationsImpl object to access its operations.
     */
    private final DurationOperationsImpl durationOperations;

    /**
     * Gets the DurationOperationsImpl object to access its operations.
     * 
     * @return the DurationOperationsImpl object.
     */
    public DurationOperationsImpl getDurationOperations() {
        return this.durationOperations;
    }

    /**
     * The EnumsImpl object to access its operations.
     */
    private final EnumsImpl enums;

    /**
     * Gets the EnumsImpl object to access its operations.
     * 
     * @return the EnumsImpl object.
     */
    public EnumsImpl getEnums() {
        return this.enums;
    }

    /**
     * The ExtensibleEnumsImpl object to access its operations.
     */
    private final ExtensibleEnumsImpl extensibleEnums;

    /**
     * Gets the ExtensibleEnumsImpl object to access its operations.
     * 
     * @return the ExtensibleEnumsImpl object.
     */
    public ExtensibleEnumsImpl getExtensibleEnums() {
        return this.extensibleEnums;
    }

    /**
     * The ModelsImpl object to access its operations.
     */
    private final ModelsImpl models;

    /**
     * Gets the ModelsImpl object to access its operations.
     * 
     * @return the ModelsImpl object.
     */
    public ModelsImpl getModels() {
        return this.models;
    }

    /**
     * The CollectionsStringsImpl object to access its operations.
     */
    private final CollectionsStringsImpl collectionsStrings;

    /**
     * Gets the CollectionsStringsImpl object to access its operations.
     * 
     * @return the CollectionsStringsImpl object.
     */
    public CollectionsStringsImpl getCollectionsStrings() {
        return this.collectionsStrings;
    }

    /**
     * The CollectionsIntsImpl object to access its operations.
     */
    private final CollectionsIntsImpl collectionsInts;

    /**
     * Gets the CollectionsIntsImpl object to access its operations.
     * 
     * @return the CollectionsIntsImpl object.
     */
    public CollectionsIntsImpl getCollectionsInts() {
        return this.collectionsInts;
    }

    /**
     * The CollectionsModelsImpl object to access its operations.
     */
    private final CollectionsModelsImpl collectionsModels;

    /**
     * Gets the CollectionsModelsImpl object to access its operations.
     * 
     * @return the CollectionsModelsImpl object.
     */
    public CollectionsModelsImpl getCollectionsModels() {
        return this.collectionsModels;
    }

    /**
     * The DictionaryStringsImpl object to access its operations.
     */
    private final DictionaryStringsImpl dictionaryStrings;

    /**
     * Gets the DictionaryStringsImpl object to access its operations.
     * 
     * @return the DictionaryStringsImpl object.
     */
    public DictionaryStringsImpl getDictionaryStrings() {
        return this.dictionaryStrings;
    }

    /**
     * The NeversImpl object to access its operations.
     */
    private final NeversImpl nevers;

    /**
     * Gets the NeversImpl object to access its operations.
     * 
     * @return the NeversImpl object.
     */
    public NeversImpl getNevers() {
        return this.nevers;
    }

    /**
     * The UnknownStringsImpl object to access its operations.
     */
    private final UnknownStringsImpl unknownStrings;

    /**
     * Gets the UnknownStringsImpl object to access its operations.
     * 
     * @return the UnknownStringsImpl object.
     */
    public UnknownStringsImpl getUnknownStrings() {
        return this.unknownStrings;
    }

    /**
     * The UnknownIntsImpl object to access its operations.
     */
    private final UnknownIntsImpl unknownInts;

    /**
     * Gets the UnknownIntsImpl object to access its operations.
     * 
     * @return the UnknownIntsImpl object.
     */
    public UnknownIntsImpl getUnknownInts() {
        return this.unknownInts;
    }

    /**
     * The UnknownDictsImpl object to access its operations.
     */
    private final UnknownDictsImpl unknownDicts;

    /**
     * Gets the UnknownDictsImpl object to access its operations.
     * 
     * @return the UnknownDictsImpl object.
     */
    public UnknownDictsImpl getUnknownDicts() {
        return this.unknownDicts;
    }

    /**
     * The UnknownArraysImpl object to access its operations.
     */
    private final UnknownArraysImpl unknownArrays;

    /**
     * Gets the UnknownArraysImpl object to access its operations.
     * 
     * @return the UnknownArraysImpl object.
     */
    public UnknownArraysImpl getUnknownArrays() {
        return this.unknownArrays;
    }

    /**
     * The StringLiteralsImpl object to access its operations.
     */
    private final StringLiteralsImpl stringLiterals;

    /**
     * Gets the StringLiteralsImpl object to access its operations.
     * 
     * @return the StringLiteralsImpl object.
     */
    public StringLiteralsImpl getStringLiterals() {
        return this.stringLiterals;
    }

    /**
     * The IntLiteralsImpl object to access its operations.
     */
    private final IntLiteralsImpl intLiterals;

    /**
     * Gets the IntLiteralsImpl object to access its operations.
     * 
     * @return the IntLiteralsImpl object.
     */
    public IntLiteralsImpl getIntLiterals() {
        return this.intLiterals;
    }

    /**
     * The FloatLiteralsImpl object to access its operations.
     */
    private final FloatLiteralsImpl floatLiterals;

    /**
     * Gets the FloatLiteralsImpl object to access its operations.
     * 
     * @return the FloatLiteralsImpl object.
     */
    public FloatLiteralsImpl getFloatLiterals() {
        return this.floatLiterals;
    }

    /**
     * The BooleanLiteralsImpl object to access its operations.
     */
    private final BooleanLiteralsImpl booleanLiterals;

    /**
     * Gets the BooleanLiteralsImpl object to access its operations.
     * 
     * @return the BooleanLiteralsImpl object.
     */
    public BooleanLiteralsImpl getBooleanLiterals() {
        return this.booleanLiterals;
    }

    /**
     * The UnionStringLiteralsImpl object to access its operations.
     */
    private final UnionStringLiteralsImpl unionStringLiterals;

    /**
     * Gets the UnionStringLiteralsImpl object to access its operations.
     * 
     * @return the UnionStringLiteralsImpl object.
     */
    public UnionStringLiteralsImpl getUnionStringLiterals() {
        return this.unionStringLiterals;
    }

    /**
     * The UnionIntLiteralsImpl object to access its operations.
     */
    private final UnionIntLiteralsImpl unionIntLiterals;

    /**
     * Gets the UnionIntLiteralsImpl object to access its operations.
     * 
     * @return the UnionIntLiteralsImpl object.
     */
    public UnionIntLiteralsImpl getUnionIntLiterals() {
        return this.unionIntLiterals;
    }

    /**
     * The UnionFloatLiteralsImpl object to access its operations.
     */
    private final UnionFloatLiteralsImpl unionFloatLiterals;

    /**
     * Gets the UnionFloatLiteralsImpl object to access its operations.
     * 
     * @return the UnionFloatLiteralsImpl object.
     */
    public UnionFloatLiteralsImpl getUnionFloatLiterals() {
        return this.unionFloatLiterals;
    }

    /**
     * The UnionEnumValuesImpl object to access its operations.
     */
    private final UnionEnumValuesImpl unionEnumValues;

    /**
     * Gets the UnionEnumValuesImpl object to access its operations.
     * 
     * @return the UnionEnumValuesImpl object.
     */
    public UnionEnumValuesImpl getUnionEnumValues() {
        return this.unionEnumValues;
    }

    /**
     * Initializes an instance of ValueTypesClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param instrumentation The instance of instrumentation to report telemetry.
     * @param endpoint Service host.
     */
    public ValueTypesClientImpl(HttpPipeline httpPipeline, Instrumentation instrumentation, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.instrumentation = instrumentation;
        this.endpoint = endpoint;
        this.booleanOperations = new BooleanOperationsImpl(this);
        this.stringOperations = new StringOperationsImpl(this);
        this.bytes = new BytesImpl(this);
        this.ints = new IntsImpl(this);
        this.floatOperations = new FloatOperationsImpl(this);
        this.decimals = new DecimalsImpl(this);
        this.decimal128s = new Decimal128sImpl(this);
        this.datetimeOperations = new DatetimeOperationsImpl(this);
        this.durationOperations = new DurationOperationsImpl(this);
        this.enums = new EnumsImpl(this);
        this.extensibleEnums = new ExtensibleEnumsImpl(this);
        this.models = new ModelsImpl(this);
        this.collectionsStrings = new CollectionsStringsImpl(this);
        this.collectionsInts = new CollectionsIntsImpl(this);
        this.collectionsModels = new CollectionsModelsImpl(this);
        this.dictionaryStrings = new DictionaryStringsImpl(this);
        this.nevers = new NeversImpl(this);
        this.unknownStrings = new UnknownStringsImpl(this);
        this.unknownInts = new UnknownIntsImpl(this);
        this.unknownDicts = new UnknownDictsImpl(this);
        this.unknownArrays = new UnknownArraysImpl(this);
        this.stringLiterals = new StringLiteralsImpl(this);
        this.intLiterals = new IntLiteralsImpl(this);
        this.floatLiterals = new FloatLiteralsImpl(this);
        this.booleanLiterals = new BooleanLiteralsImpl(this);
        this.unionStringLiterals = new UnionStringLiteralsImpl(this);
        this.unionIntLiterals = new UnionIntLiteralsImpl(this);
        this.unionFloatLiterals = new UnionFloatLiteralsImpl(this);
        this.unionEnumValues = new UnionEnumValuesImpl(this);
    }
}
