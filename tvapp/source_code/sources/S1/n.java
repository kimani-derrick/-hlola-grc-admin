package S1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final long f3124a;

    public n(long j7) {
        this.f3124a = j7;
    }

    public static n a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new n(Long.parseLong(jsonReader.nextString()));
                    }
                    return new n(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f3124a == ((n) obj).f3124a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f3124a;
        return ((int) ((j7 >>> 32) ^ j7)) ^ 1000003;
    }

    public final String toString() {
        return AbstractC1111a.s(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f3124a, "}");
    }
}
