package J4;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class e implements G4.e {
    public static final Charset f = Charset.forName("UTF-8");

    /* renamed from: g  reason: collision with root package name */
    public static final G4.c f1428g;

    /* renamed from: h  reason: collision with root package name */
    public static final G4.c f1429h;

    /* renamed from: i  reason: collision with root package name */
    public static final I4.a f1430i;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f1431a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f1432b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f1433c;
    public final G4.d d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1434e = new g(this);

    static {
        a aVar = new a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, aVar);
        f1428g = new G4.c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        a aVar2 = new a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, aVar2);
        f1429h = new G4.c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f1430i = new I4.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, G4.d dVar) {
        this.f1431a = byteArrayOutputStream;
        this.f1432b = map;
        this.f1433c = map2;
        this.d = dVar;
    }

    public static int j(G4.c cVar) {
        d dVar = (d) ((Annotation) cVar.f767b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f1424a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void a(G4.c cVar, double d, boolean z7) {
        if (z7 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f1431a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // G4.e
    public final G4.e b(G4.c cVar, int i7) {
        d(cVar, i7, true);
        return this;
    }

    @Override // G4.e
    public final G4.e c(G4.c cVar, long j7) {
        if (j7 != 0) {
            d dVar = (d) ((Annotation) cVar.f767b.get(d.class));
            if (dVar != null) {
                k(((a) dVar).f1424a << 3);
                l(j7);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    public final void d(G4.c cVar, int i7, boolean z7) {
        if (z7 && i7 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f767b.get(d.class));
        if (dVar != null) {
            k(((a) dVar).f1424a << 3);
            k(i7);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // G4.e
    public final G4.e e(G4.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override // G4.e
    public final G4.e f(G4.c cVar, double d) {
        a(cVar, d, true);
        return this;
    }

    @Override // G4.e
    public final G4.e g(G4.c cVar, boolean z7) {
        d(cVar, z7 ? 1 : 0, true);
        return this;
    }

    public final void h(G4.c cVar, Object obj, boolean z7) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.f1431a.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                h(cVar, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i(f1430i, cVar, entry, false);
            }
        } else if (obj instanceof Double) {
            a(cVar, ((Double) obj).doubleValue(), z7);
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z7 || floatValue != 0.0f) {
                k((j(cVar) << 3) | 5);
                this.f1431a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
        } else if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z7 || longValue != 0) {
                d dVar = (d) ((Annotation) cVar.f767b.get(d.class));
                if (dVar != null) {
                    k(((a) dVar).f1424a << 3);
                    l(longValue);
                    return;
                }
                throw new RuntimeException("Field has no @Protobuf config");
            }
        } else if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z7);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z7 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f1431a.write(bArr);
        } else {
            G4.d dVar2 = (G4.d) this.f1432b.get(obj.getClass());
            if (dVar2 != null) {
                i(dVar2, cVar, obj, z7);
                return;
            }
            G4.f fVar = (G4.f) this.f1433c.get(obj.getClass());
            if (fVar != null) {
                g gVar = this.f1434e;
                gVar.f1436a = false;
                gVar.f1438c = cVar;
                gVar.f1437b = z7;
                fVar.a(obj, gVar);
            } else if (obj instanceof W1.c) {
                d(cVar, ((W1.c) obj).f3756q, true);
            } else if (obj instanceof Enum) {
                d(cVar, ((Enum) obj).ordinal(), true);
            } else {
                i(this.d, cVar, obj, z7);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, J4.b] */
    public final void i(G4.d dVar, G4.c cVar, Object obj, boolean z7) {
        ?? outputStream = new OutputStream();
        outputStream.f1425q = 0L;
        try {
            OutputStream outputStream2 = this.f1431a;
            this.f1431a = outputStream;
            dVar.a(obj, this);
            this.f1431a = outputStream2;
            long j7 = outputStream.f1425q;
            outputStream.close();
            if (z7 && j7 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j7);
            dVar.a(obj, this);
        } catch (Throwable th) {
            try {
                outputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f1431a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f1431a.write(i7 & 127);
    }

    public final void l(long j7) {
        while (((-128) & j7) != 0) {
            this.f1431a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f1431a.write(((int) j7) & 127);
    }
}
