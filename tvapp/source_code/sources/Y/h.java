package Y;

import A5.k;
import A5.w;
import V.p;
import X.i;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C0232k;
import androidx.datastore.preferences.protobuf.InterfaceC0245y;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4307a = new Object();

    public final b a(FileInputStream fileInputStream) {
        int i7;
        d dVar;
        Object valueOf;
        try {
            X.e l7 = X.e.l(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            M5.g.f(eVarArr, "pairs");
            bVar.a();
            if (eVarArr.length <= 0) {
                Map j7 = l7.j();
                M5.g.e(j7, "preferencesProto.preferencesMap");
                for (Map.Entry entry : j7.entrySet()) {
                    String str = (String) entry.getKey();
                    i iVar = (i) entry.getValue();
                    M5.g.e(str, "name");
                    M5.g.e(iVar, "value");
                    int x7 = iVar.x();
                    if (x7 == 0) {
                        i7 = -1;
                    } else {
                        i7 = g.f4306a[s.h.b(x7)];
                    }
                    switch (i7) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            dVar = new d(str);
                            valueOf = Boolean.valueOf(iVar.p());
                            break;
                        case 2:
                            dVar = new d(str);
                            valueOf = Float.valueOf(iVar.s());
                            break;
                        case 3:
                            dVar = new d(str);
                            valueOf = Double.valueOf(iVar.r());
                            break;
                        case 4:
                            dVar = new d(str);
                            valueOf = Integer.valueOf(iVar.t());
                            break;
                        case 5:
                            dVar = new d(str);
                            valueOf = Long.valueOf(iVar.u());
                            break;
                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                            dVar = new d(str);
                            valueOf = iVar.v();
                            M5.g.e(valueOf, "value.string");
                            break;
                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                            dVar = new d(str);
                            InterfaceC0245y k5 = iVar.w().k();
                            M5.g.e(k5, "value.stringSet.stringsList");
                            valueOf = k.o0(k5);
                            break;
                        case 8:
                            throw new IOException("Value not set.", null);
                    }
                    bVar.c(dVar, valueOf);
                }
                Map unmodifiableMap = Collections.unmodifiableMap(bVar.f4297a);
                M5.g.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                return new b(w.P(unmodifiableMap), true);
            }
            e eVar = eVarArr[0];
            throw null;
        } catch (B e3) {
            throw new IOException("Unable to parse preferences proto.", e3);
        }
    }

    public final void b(Object obj, p pVar) {
        X.h y3;
        Map unmodifiableMap = Collections.unmodifiableMap(((b) obj).f4297a);
        M5.g.e(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        X.c k5 = X.e.k();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            Object value = entry.getValue();
            String str = ((d) entry.getKey()).f4302a;
            if (value instanceof Boolean) {
                y3 = i.y();
                boolean booleanValue = ((Boolean) value).booleanValue();
                y3.d();
                i.m((i) y3.f5824r, booleanValue);
            } else if (value instanceof Float) {
                y3 = i.y();
                float floatValue = ((Number) value).floatValue();
                y3.d();
                i.n((i) y3.f5824r, floatValue);
            } else if (value instanceof Double) {
                y3 = i.y();
                double doubleValue = ((Number) value).doubleValue();
                y3.d();
                i.l((i) y3.f5824r, doubleValue);
            } else if (value instanceof Integer) {
                y3 = i.y();
                int intValue = ((Number) value).intValue();
                y3.d();
                i.o((i) y3.f5824r, intValue);
            } else if (value instanceof Long) {
                y3 = i.y();
                long longValue = ((Number) value).longValue();
                y3.d();
                i.i((i) y3.f5824r, longValue);
            } else if (value instanceof String) {
                y3 = i.y();
                y3.d();
                i.j((i) y3.f5824r, (String) value);
            } else if (value instanceof Set) {
                y3 = i.y();
                X.f l7 = X.g.l();
                l7.d();
                X.g.i((X.g) l7.f5824r, (Set) value);
                y3.d();
                i.k((i) y3.f5824r, l7);
            } else {
                throw new IllegalStateException(M5.g.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            i iVar = (i) y3.b();
            k5.getClass();
            str.getClass();
            k5.d();
            X.e.i((X.e) k5.f5824r).put(str, iVar);
        }
        X.e eVar = (X.e) k5.b();
        int a7 = eVar.a();
        Logger logger = C0232k.f5791h;
        if (a7 > 4096) {
            a7 = 4096;
        }
        C0232k c0232k = new C0232k(pVar, a7);
        eVar.c(c0232k);
        if (c0232k.f > 0) {
            c0232k.P();
        }
    }
}
