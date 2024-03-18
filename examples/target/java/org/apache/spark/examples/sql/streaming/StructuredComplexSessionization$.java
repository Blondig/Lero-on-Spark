package org.apache.spark.examples.sql.streaming;
/**
 * Sessionize events in UTF8 encoded, '\n' delimited text received from the network.
 * Each line composes an event, and the line should match to the json format.
 * <p>
 * The schema of the event is following:
 * - user_id: String
 * - event_type: String
 * - timestamp: Long
 * <p>
 * The supported types are following:
 * - NEW_EVENT
 * - CLOSE_SESSION
 * <p>
 * This example focuses to demonstrate the complex sessionization which uses two conditions
 * on closing session; conditions are following:
 * - No further event is provided for the user ID within 5 seconds
 * - An event having CLOSE_SESSION as event_type is provided for the user ID
 * <p>
 * Usage: StructuredComplexSessionization <hostname> <port>
 * <hostname> and <port> describe the TCP server that Structured Streaming
 * would connect to receive data.
 * <p>
 * To run this on your local machine, you need to first run a Netcat server
 * <code>$ nc -lk 9999</code>
 * and then run the example
 * <code>$ bin/run-example sql.streaming.StructuredComplexSessionization
 * localhost 9999</code>
 * <p>
 * Here's a set of events for example:
 * <p>
 * {"user_id": "user1", "event_type": "NEW_EVENT", "timestamp": 13}
 * {"user_id": "user1", "event_type": "NEW_EVENT", "timestamp": 10}
 * {"user_id": "user1", "event_type": "CLOSE_SESSION", "timestamp": 15}
 * {"user_id": "user1", "event_type": "NEW_EVENT", "timestamp": 17}
 * {"user_id": "user1", "event_type": "NEW_EVENT", "timestamp": 19}
 * {"user_id": "user1", "event_type": "NEW_EVENT", "timestamp": 29}
 * <p>
 * {"user_id": "user2", "event_type": "NEW_EVENT", "timestamp": 45}
 * <p>
 * {"user_id": "user1", "event_type": "NEW_EVENT", "timestamp": 65}
 * <p>
 * and results (the output can be split across micro-batches):
 * <p>
 * +-----+----------+---------+
 * |   id|durationMs|numEvents|
 * +-----+----------+---------+
 * |user1|      5000|        3|
 * |user1|      7000|        2|
 * |user1|      5000|        1|
 * |user2|      5000|        1|
 * +-----+----------+---------+
 * (The last event is not reflected into output due to watermark.)
 * <p>
 * Note that there're three different sessions for 'user1'. The events in first two sessions
 * are occurred within gap duration for nearest events, but they don't compose a single session
 * due to the event of CLOSE_SESSION.
 * <p>
 * Also note that the implementation is simplified one. This example doesn't address
 * - UPDATE MODE (the semantic is not clear for session window with event time processing)
 * - partial merge (events in session which are earlier than watermark can be aggregated)
 * - other possible optimizations
 */
public  class StructuredComplexSessionization$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StructuredComplexSessionization$ MODULE$ = null;
  public   StructuredComplexSessionization$ ()  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
