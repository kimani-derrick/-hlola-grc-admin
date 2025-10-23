package q6;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f13400a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i7;
        int min;
        M5.g.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f13398a;
        String loggerName = logRecord.getLoggerName();
        M5.g.e(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i7 = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i7 = 4;
        } else {
            i7 = 3;
        }
        String message = logRecord.getMessage();
        M5.g.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f13399b.get(loggerName);
        if (str == null) {
            str = U5.f.B0(loggerName, 23);
        }
        if (Log.isLoggable(str, i7)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int i02 = U5.f.i0(message, '\n', i8, false, 4);
                if (i02 == -1) {
                    i02 = length;
                }
                while (true) {
                    min = Math.min(i02, i8 + 4000);
                    String substring = message.substring(i8, min);
                    M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i7, str, substring);
                    if (min >= i02) {
                        break;
                    }
                    i8 = min;
                }
                i8 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
