package o2;

import Z2.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: o2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065c extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public long f12907r;

    /* renamed from: s  reason: collision with root package name */
    public long[] f12908s;

    /* renamed from: t  reason: collision with root package name */
    public long[] f12909t;

    public static Serializable F(int i7, y yVar) {
        if (i7 != 0) {
            boolean z7 = true;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 8) {
                            if (i7 != 10) {
                                if (i7 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(yVar.o()));
                                yVar.G(2);
                                return date;
                            }
                            int x7 = yVar.x();
                            ArrayList arrayList = new ArrayList(x7);
                            for (int i8 = 0; i8 < x7; i8++) {
                                Serializable F = F(yVar.u(), yVar);
                                if (F != null) {
                                    arrayList.add(F);
                                }
                            }
                            return arrayList;
                        }
                        return G(yVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String H6 = H(yVar);
                        int u7 = yVar.u();
                        if (u7 == 9) {
                            return hashMap;
                        }
                        Serializable F4 = F(u7, yVar);
                        if (F4 != null) {
                            hashMap.put(H6, F4);
                        }
                    }
                } else {
                    return H(yVar);
                }
            } else {
                if (yVar.u() != 1) {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(yVar.o()));
        }
    }

    public static HashMap G(y yVar) {
        int x7 = yVar.x();
        HashMap hashMap = new HashMap(x7);
        for (int i7 = 0; i7 < x7; i7++) {
            String H6 = H(yVar);
            Serializable F = F(yVar.u(), yVar);
            if (F != null) {
                hashMap.put(H6, F);
            }
        }
        return hashMap;
    }

    public static String H(y yVar) {
        int z7 = yVar.z();
        int i7 = yVar.f4692b;
        yVar.G(z7);
        return new String(yVar.f4691a, i7, z7);
    }

    public final boolean E(long j7, y yVar) {
        if (yVar.u() != 2 || !"onMetaData".equals(H(yVar)) || yVar.a() == 0 || yVar.u() != 8) {
            return false;
        }
        HashMap G6 = G(yVar);
        Object obj = G6.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f12907r = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = G6.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f12908s = new long[size];
                this.f12909t = new long[size];
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj5 = list.get(i7);
                    Object obj6 = list2.get(i7);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f12908s[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f12909t[i7] = ((Double) obj5).longValue();
                    } else {
                        this.f12908s = new long[0];
                        this.f12909t = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
