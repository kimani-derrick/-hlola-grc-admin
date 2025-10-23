package androidx.datastore.preferences.protobuf;

import java.util.Map;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class N {
    public static int a(Object obj, int i7, Object obj2) {
        Object obj3;
        Object obj4;
        int O5;
        int a7;
        int M6;
        Object obj5;
        Object obj6;
        int a8;
        int M7;
        M m7 = (M) obj;
        L l7 = (L) obj2;
        int i8 = 0;
        if (!m7.isEmpty()) {
            for (Map.Entry entry : m7.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                l7.getClass();
                int K6 = C0232k.K(i7);
                C4.b bVar = l7.f5706a;
                A0 a02 = (A0) bVar.f421r;
                int i9 = C0238q.f5805c;
                int K7 = C0232k.K(1);
                x0 x0Var = A0.f5671t;
                if (a02 == x0Var) {
                    K7 *= 2;
                }
                int i10 = 8;
                switch (a02.ordinal()) {
                    case 0:
                        obj3 = (Double) key;
                        obj3.getClass();
                        O5 = 8;
                        break;
                    case 1:
                        obj4 = (Float) key;
                        obj4.getClass();
                        O5 = 4;
                        break;
                    case 2:
                        O5 = C0232k.O(((Long) key).longValue());
                        break;
                    case 3:
                        O5 = C0232k.O(((Long) key).longValue());
                        break;
                    case 4:
                        O5 = C0232k.C(((Integer) key).intValue());
                        break;
                    case 5:
                    case 15:
                        obj3 = (Long) key;
                        obj3.getClass();
                        O5 = 8;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 14:
                        obj4 = (Integer) key;
                        obj4.getClass();
                        O5 = 4;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) key).getClass();
                        O5 = 1;
                        break;
                    case 8:
                        if (!(key instanceof C0228g)) {
                            O5 = C0232k.J((String) key);
                            break;
                        }
                        O5 = C0232k.u((C0228g) key);
                        break;
                    case 9:
                        O5 = ((AbstractC0220a) key).a();
                        break;
                    case 10:
                        a7 = ((AbstractC0220a) key).a();
                        M6 = C0232k.M(a7);
                        O5 = a7 + M6;
                        break;
                    case 11:
                        if (!(key instanceof C0228g)) {
                            a7 = ((byte[]) key).length;
                            M6 = C0232k.M(a7);
                            O5 = a7 + M6;
                            break;
                        }
                        O5 = C0232k.u((C0228g) key);
                        break;
                    case 12:
                        O5 = C0232k.M(((Integer) key).intValue());
                        break;
                    case 13:
                        O5 = C0232k.C(((Integer) key).intValue());
                        break;
                    case 16:
                        int intValue = ((Integer) key).intValue();
                        O5 = C0232k.M((intValue >> 31) ^ (intValue << 1));
                        break;
                    case 17:
                        long longValue = ((Long) key).longValue();
                        O5 = C0232k.O((longValue << 1) ^ (longValue >> 63));
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
                int i11 = O5 + K7;
                int K8 = C0232k.K(2);
                A0 a03 = (A0) bVar.f423t;
                if (a03 == x0Var) {
                    K8 *= 2;
                }
                switch (a03.ordinal()) {
                    case 0:
                        obj5 = (Double) value;
                        obj5.getClass();
                        break;
                    case 1:
                        obj6 = (Float) value;
                        obj6.getClass();
                        i10 = 4;
                        break;
                    case 2:
                        i10 = C0232k.O(((Long) value).longValue());
                        break;
                    case 3:
                        i10 = C0232k.O(((Long) value).longValue());
                        break;
                    case 4:
                        i10 = C0232k.C(((Integer) value).intValue());
                        break;
                    case 5:
                    case 15:
                        obj5 = (Long) value;
                        obj5.getClass();
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 14:
                        obj6 = (Integer) value;
                        obj6.getClass();
                        i10 = 4;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) value).getClass();
                        i10 = 1;
                        break;
                    case 8:
                        if (!(value instanceof C0228g)) {
                            i10 = C0232k.J((String) value);
                            break;
                        }
                        i10 = C0232k.u((C0228g) value);
                        break;
                    case 9:
                        i10 = ((AbstractC0220a) value).a();
                        break;
                    case 10:
                        a8 = ((AbstractC0220a) value).a();
                        M7 = C0232k.M(a8);
                        i10 = M7 + a8;
                        break;
                    case 11:
                        if (!(value instanceof C0228g)) {
                            a8 = ((byte[]) value).length;
                            M7 = C0232k.M(a8);
                            i10 = M7 + a8;
                            break;
                        }
                        i10 = C0232k.u((C0228g) value);
                        break;
                    case 12:
                        i10 = C0232k.M(((Integer) value).intValue());
                        break;
                    case 13:
                        i10 = C0232k.C(((Integer) value).intValue());
                        break;
                    case 16:
                        int intValue2 = ((Integer) value).intValue();
                        i10 = C0232k.M((intValue2 >> 31) ^ (intValue2 << 1));
                        break;
                    case 17:
                        long longValue2 = ((Long) value).longValue();
                        i10 = C0232k.O((longValue2 >> 63) ^ (longValue2 << 1));
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
                int i12 = i10 + K8 + i11;
                i8 = AbstractC1111a.l(i12, i12, K6, i8);
            }
        }
        return i8;
    }

    public static M b(Object obj, Object obj2) {
        M m7 = (M) obj;
        M m8 = (M) obj2;
        if (!m8.isEmpty()) {
            if (!m7.f5710q) {
                m7 = m7.c();
            }
            m7.b();
            if (!m8.isEmpty()) {
                m7.putAll(m8);
            }
        }
        return m7;
    }
}
