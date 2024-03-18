package org.apache.spark.ml.source.image;
/**
 * <code>image</code> package implements Spark SQL data source API for loading image data as <code>DataFrame</code>.
 * It can load compressed image (jpeg, png, etc.) into raw image representation via <code>ImageIO</code>
 * in Java library.
 * The loaded <code>DataFrame</code> has one <code>StructType</code> column: <code>image</code>, containing image data stored
 * as image schema.
 * The schema of the <code>image</code> column is:
 *  - origin: <code>StringType</code> (represents the file path of the image)
 *  - height: <code>IntegerType</code> (height of the image)
 *  - width: <code>IntegerType</code> (width of the image)
 *  - nChannels: <code>IntegerType</code> (number of image channels)
 *  - mode: <code>IntegerType</code> (OpenCV-compatible type)
 *  - data: <code>BinaryType</code> (Image bytes in OpenCV-compatible order: row-wise BGR in most cases)
 * <p>
 * To use image data source, you need to set "image" as the format in <code>DataFrameReader</code> and
 * optionally specify the data source options, for example:
 * <pre><code>
 *   // Scala
 *   val df = spark.read.format("image")
 *     .option("dropInvalid", true)
 *     .load("/path/to/images")
 *
 *   // Java
 *   Dataset&lt;Row&gt; df = spark.read().format("image")
 *     .option("dropInvalid", true)
 *     .load("/path/to/images");
 * </code></pre>
 * <p>
 * Image data source supports the following options:
 *  - "dropInvalid": Whether to drop the files that are not valid images from the result.
 * <p>
 * @note This IMAGE data source does not support saving images to files.
 * <p>
 * @note This class is public for documentation purpose. Please don't use this class directly.
 * Rather, use the data source API as illustrated above.
 */
public  class ImageDataSource {
}
