/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.huawei.hwclouds.drs.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Timestamp extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4308662166148827007L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Timestamp\",\"namespace\":\"com.huawei.hwclouds.drs.avro\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"millis\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Timestamp> ENCODER =
      new BinaryMessageEncoder<Timestamp>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Timestamp> DECODER =
      new BinaryMessageDecoder<Timestamp>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Timestamp> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Timestamp> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Timestamp>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Timestamp to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Timestamp from a ByteBuffer. */
  public static Timestamp fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long timestamp;
  @Deprecated public int millis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Timestamp() {}

  /**
   * All-args constructor.
   * @param timestamp The new value for timestamp
   * @param millis The new value for millis
   */
  public Timestamp(java.lang.Long timestamp, java.lang.Integer millis) {
    this.timestamp = timestamp;
    this.millis = millis;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return millis;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: millis = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'millis' field.
   * @return The value of the 'millis' field.
   */
  public java.lang.Integer getMillis() {
    return millis;
  }

  /**
   * Sets the value of the 'millis' field.
   * @param value the value to set.
   */
  public void setMillis(java.lang.Integer value) {
    this.millis = value;
  }

  /**
   * Creates a new Timestamp RecordBuilder.
   * @return A new Timestamp RecordBuilder
   */
  public static com.huawei.hwclouds.drs.avro.Timestamp.Builder newBuilder() {
    return new com.huawei.hwclouds.drs.avro.Timestamp.Builder();
  }

  /**
   * Creates a new Timestamp RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Timestamp RecordBuilder
   */
  public static com.huawei.hwclouds.drs.avro.Timestamp.Builder newBuilder(com.huawei.hwclouds.drs.avro.Timestamp.Builder other) {
    return new com.huawei.hwclouds.drs.avro.Timestamp.Builder(other);
  }

  /**
   * Creates a new Timestamp RecordBuilder by copying an existing Timestamp instance.
   * @param other The existing instance to copy.
   * @return A new Timestamp RecordBuilder
   */
  public static com.huawei.hwclouds.drs.avro.Timestamp.Builder newBuilder(com.huawei.hwclouds.drs.avro.Timestamp other) {
    return new com.huawei.hwclouds.drs.avro.Timestamp.Builder(other);
  }

  /**
   * RecordBuilder for Timestamp instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Timestamp>
    implements org.apache.avro.data.RecordBuilder<Timestamp> {

    private long timestamp;
    private int millis;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.huawei.hwclouds.drs.avro.Timestamp.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.millis)) {
        this.millis = data().deepCopy(fields()[1].schema(), other.millis);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Timestamp instance
     * @param other The existing instance to copy.
     */
    private Builder(com.huawei.hwclouds.drs.avro.Timestamp other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.millis)) {
        this.millis = data().deepCopy(fields()[1].schema(), other.millis);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Timestamp.Builder setTimestamp(long value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Timestamp.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'millis' field.
      * @return The value.
      */
    public java.lang.Integer getMillis() {
      return millis;
    }

    /**
      * Sets the value of the 'millis' field.
      * @param value The value of 'millis'.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Timestamp.Builder setMillis(int value) {
      validate(fields()[1], value);
      this.millis = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'millis' field has been set.
      * @return True if the 'millis' field has been set, false otherwise.
      */
    public boolean hasMillis() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'millis' field.
      * @return This builder.
      */
    public com.huawei.hwclouds.drs.avro.Timestamp.Builder clearMillis() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Timestamp build() {
      try {
        Timestamp record = new Timestamp();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.Long) defaultValue(fields()[0]);
        record.millis = fieldSetFlags()[1] ? this.millis : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Timestamp>
    WRITER$ = (org.apache.avro.io.DatumWriter<Timestamp>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Timestamp>
    READER$ = (org.apache.avro.io.DatumReader<Timestamp>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
