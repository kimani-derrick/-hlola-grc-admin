package U5;

import L5.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import z5.C1524f;
/* loaded from: classes.dex */
public final class o extends M5.h implements p {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f3488r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f3489s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f3490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, boolean z7, int i7) {
        super(2);
        this.f3488r = i7;
        this.f3490t = obj;
        this.f3489s = z7;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        int i7;
        int i8;
        boolean z7;
        Object obj3;
        C1524f c1524f;
        Object obj4;
        Object obj5;
        switch (this.f3488r) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                M5.g.f(charSequence, "$this$$receiver");
                int k02 = f.k0(charSequence, (char[]) this.f3490t, intValue, this.f3489s);
                if (k02 < 0) {
                    return null;
                }
                return new C1524f(Integer.valueOf(k02), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                M5.g.f(charSequence2, "$this$$receiver");
                List list = (List) this.f3490t;
                boolean z8 = this.f3489s;
                if (!z8 && list.size() == 1) {
                    List list2 = list;
                    if (list2 instanceof List) {
                        List list3 = list2;
                        int size = list3.size();
                        if (size != 0) {
                            if (size == 1) {
                                obj5 = list3.get(0);
                            } else {
                                throw new IllegalArgumentException("List has more than one element.");
                            }
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    } else {
                        Iterator it = list2.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (!it.hasNext()) {
                                obj5 = next;
                            } else {
                                throw new IllegalArgumentException("Collection has more than one element.");
                            }
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    String str = (String) obj5;
                    int j02 = f.j0(charSequence2, str, intValue2, false, 4);
                    if (j02 >= 0) {
                        c1524f = new C1524f(Integer.valueOf(j02), str);
                    }
                    c1524f = null;
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    R5.a aVar = new R5.a(intValue2, charSequence2.length(), 1);
                    boolean z9 = charSequence2 instanceof String;
                    int i9 = aVar.f2924s;
                    int i10 = aVar.f2923r;
                    if (z9) {
                        if ((i9 > 0 && intValue2 <= i10) || (i9 < 0 && i10 <= intValue2)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        String str2 = (String) obj4;
                                        if (n.Y(0, intValue2, str2.length(), str2, (String) charSequence2, z8)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c1524f = new C1524f(Integer.valueOf(intValue2), str3);
                                } else if (intValue2 != i10) {
                                    intValue2 += i9;
                                }
                            }
                        }
                        c1524f = null;
                    } else {
                        if ((i9 > 0 && intValue2 <= i10) || (i9 < 0 && i10 <= intValue2)) {
                            int i11 = intValue2;
                            while (true) {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        String str4 = (String) obj3;
                                        i7 = i10;
                                        i8 = i9;
                                        z7 = z8;
                                        if (!f.p0(str4, 0, charSequence2, i11, str4.length(), z8)) {
                                            z8 = z7;
                                            i10 = i7;
                                            i9 = i8;
                                        }
                                    } else {
                                        i7 = i10;
                                        i8 = i9;
                                        z7 = z8;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c1524f = new C1524f(Integer.valueOf(i11), str5);
                                } else if (i11 != i7) {
                                    i11 += i8;
                                    z8 = z7;
                                    i10 = i7;
                                    i9 = i8;
                                }
                            }
                        }
                        c1524f = null;
                    }
                }
                if (c1524f == null) {
                    return null;
                }
                return new C1524f(c1524f.f16468q, Integer.valueOf(((String) c1524f.f16469r).length()));
        }
    }
}
