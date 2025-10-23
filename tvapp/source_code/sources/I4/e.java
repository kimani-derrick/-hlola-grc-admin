package I4;

import G4.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class e implements G4.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1262a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f1263b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f1264c;
    public final Map d;

    /* renamed from: e  reason: collision with root package name */
    public final G4.d f1265e;
    public final boolean f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z7) {
        this.f1263b = new JsonWriter(writer);
        this.f1264c = hashMap;
        this.d = hashMap2;
        this.f1265e = aVar;
        this.f = z7;
    }

    @Override // G4.g
    public final g a(String str) {
        j();
        this.f1263b.value(str);
        return this;
    }

    @Override // G4.e
    public final G4.e b(G4.c cVar, int i7) {
        String str = cVar.f766a;
        j();
        JsonWriter jsonWriter = this.f1263b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i7);
        return this;
    }

    @Override // G4.e
    public final G4.e c(G4.c cVar, long j7) {
        String str = cVar.f766a;
        j();
        JsonWriter jsonWriter = this.f1263b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j7);
        return this;
    }

    @Override // G4.g
    public final g d(boolean z7) {
        j();
        this.f1263b.value(z7);
        return this;
    }

    @Override // G4.e
    public final G4.e e(G4.c cVar, Object obj) {
        i(obj, cVar.f766a);
        return this;
    }

    @Override // G4.e
    public final G4.e f(G4.c cVar, double d) {
        String str = cVar.f766a;
        j();
        JsonWriter jsonWriter = this.f1263b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // G4.e
    public final G4.e g(G4.c cVar, boolean z7) {
        String str = cVar.f766a;
        j();
        JsonWriter jsonWriter = this.f1263b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z7);
        return this;
    }

    public final e h(Object obj) {
        int i7 = 0;
        JsonWriter jsonWriter = this.f1263b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i7 < length) {
                    jsonWriter.value(iArr[i7]);
                    i7++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i7 < length2) {
                    long j7 = jArr[i7];
                    j();
                    jsonWriter.value(j7);
                    i7++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i7 < length3) {
                    jsonWriter.value(dArr[i7]);
                    i7++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i7 < length4) {
                    jsonWriter.value(zArr[i7]);
                    i7++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i7 < length5) {
                    h(numberArr[i7]);
                    i7++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i7 < length6) {
                    h(objArr[i7]);
                    i7++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                h(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i(entry.getValue(), (String) key);
                } catch (ClassCastException e3) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            G4.d dVar = (G4.d) this.f1264c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            G4.f fVar = (G4.f) this.d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                if (obj instanceof f) {
                    int a7 = ((f) obj).a();
                    j();
                    jsonWriter.value(a7);
                } else {
                    String name = ((Enum) obj).name();
                    j();
                    jsonWriter.value(name);
                }
                return this;
            } else {
                jsonWriter.beginObject();
                this.f1265e.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
        }
    }

    public final e i(Object obj, String str) {
        boolean z7 = this.f;
        JsonWriter jsonWriter = this.f1263b;
        if (z7) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() {
        if (this.f1262a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
