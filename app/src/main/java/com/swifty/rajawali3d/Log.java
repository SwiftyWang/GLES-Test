package com.swifty.rajawali3d;

/**
 * Created by Swifty.Wang on 2015/8/4.
 */
public class Log {

    private Log() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isDebug = true;
    private static final String TAG = "HandyDebug";

    public static void setIsDebug(boolean isDebug1) {
        isDebug = isDebug1;
    }

    public static void v(Object m) {
        v(TAG, m);
    }

    public static void v(String tag, Object m) {
        v(tag, m, null);
    }

    public static void v(String tag, Object m, Throwable t) {
        if (isDebug) {
            if (m == null) m = "null";
            String msg = m.toString();
            if (msg.length() > 4000) {
                if (t == null) {
                    android.util.Log.v(tag, "sb.length = " + msg.length());
                } else {
                    android.util.Log.v(tag, "sb.length = " + msg.length(), t);
                }
                int chunkCount = msg.length() / 4000;     // integer division
                for (int i = 0; i <= chunkCount; i++) {
                    int max = 4000 * (i + 1);
                    if (max >= msg.length()) {
                        android.util.Log.v(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i));
                    } else {
                        android.util.Log.v(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i, max));
                    }
                }
            } else {
                if (t == null) {
                    android.util.Log.v(tag, msg);
                } else {
                    android.util.Log.v(tag, msg, t);
                }
            }
        }
    }

    public static void d(Object m) {
        d(TAG, m);
    }

    public static void d(String tag, Object m) {
        d(tag, m, null);
    }

    public static void d(String tag, Object m, Throwable t) {
        if (isDebug) {
            if (m == null) m = "null";
            String msg = m.toString();
            if (msg.length() > 4000) {
                if (t == null) {
                    android.util.Log.d(tag, "sb.length = " + msg.length());
                } else {
                    android.util.Log.d(tag, "sb.length = " + msg.length(), t);
                }
                int chunkCount = msg.length() / 4000;     // integer division
                for (int i = 0; i <= chunkCount; i++) {
                    int max = 4000 * (i + 1);
                    if (max >= msg.length()) {
                        android.util.Log.d(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i));
                    } else {
                        android.util.Log.d(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i, max));
                    }
                }
            } else {
                if (t == null) {
                    android.util.Log.d(tag, msg);
                } else {
                    android.util.Log.d(tag, msg, t);
                }
            }
        }
    }

    public static void i(Object m) {
        i(TAG, m);
    }

    public static void i(String tag, Object m) {
        i(tag, m, null);
    }

    public static void i(String tag, Object m, Throwable t) {
        if (isDebug) {
            if (m == null) m = "null";
            String msg = m.toString();
            if (msg.length() > 4000) {
                if (t == null) {
                    android.util.Log.i(tag, "sb.length = " + msg.length());
                } else {
                    android.util.Log.i(tag, "sb.length = " + msg.length(), t);
                }
                int chunkCount = msg.length() / 4000;     // integer division
                for (int i = 0; i <= chunkCount; i++) {
                    int max = 4000 * (i + 1);
                    if (max >= msg.length()) {
                        android.util.Log.i(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i));
                    } else {
                        android.util.Log.i(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i, max));
                    }
                }
            } else {
                if (t == null) {
                    android.util.Log.i(tag, msg);
                } else {
                    android.util.Log.i(tag, msg, t);
                }
            }
        }
    }

    /**
     * Use it when in try block
     * @param m
     */
    public static void w(Object m) {
        w(TAG, m);
    }

    public static void w(String tag, Object m) {
        w(tag, m, null);
    }

    public static void w(String tag, Object m, Throwable t) {
        if (isDebug) {
            if (m == null) m = "null";
            String msg = m.toString();
            if (msg.length() > 4000) {
                if (t == null) {
                    android.util.Log.w(tag, "sb.length = " + msg.length());
                } else {
                    android.util.Log.w(tag, "sb.length = " + msg.length(), t);
                }
                int chunkCount = msg.length() / 4000;     // integer division
                for (int i = 0; i <= chunkCount; i++) {
                    int max = 4000 * (i + 1);
                    if (max >= msg.length()) {
                        android.util.Log.w(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i));
                    } else {
                        android.util.Log.w(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i, max));
                    }
                }
            } else {
                if (t == null) {
                    android.util.Log.w(tag, msg);
                } else {
                    android.util.Log.w(tag, msg, t);
                }
            }
        }
    }

    /**
     * Use it when in catch block or error happens
     * @param m
     */
    public static void e(Object m) {
        e(TAG, m);
    }

    public static void e(String tag, Object m) {
        e(tag, m, null);
    }

    public static void e(String tag, Object m, Throwable t) {
        if (isDebug) {
            if (m == null) m = "null";
            String msg = m.toString();
            if (msg.length() > 4000) {
                if (t == null) {
                    android.util.Log.e(tag, "sb.length = " + msg.length());
                } else {
                    android.util.Log.e(tag, "sb.length = " + msg.length(), t);
                }
                int chunkCount = msg.length() / 4000;     // integer division
                for (int i = 0; i <= chunkCount; i++) {
                    int max = 4000 * (i + 1);
                    if (max >= msg.length()) {
                        android.util.Log.e(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i));
                    } else {
                        android.util.Log.e(tag, "chunk " + i + " of " + chunkCount + ":" + msg.substring(4000 * i, max));
                    }
                }
            } else {
                if (t == null) {
                    android.util.Log.e(tag, msg);
                } else {
                    android.util.Log.e(tag, msg, t);
                }
            }
        }
    }
}