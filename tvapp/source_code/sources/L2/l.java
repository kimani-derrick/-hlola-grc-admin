package L2;

import android.net.Uri;
import e2.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: l  reason: collision with root package name */
    public static final l f1993l = new l("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public final List f1994e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final List f1995g;

    /* renamed from: h  reason: collision with root package name */
    public final K f1996h;

    /* renamed from: i  reason: collision with root package name */
    public final List f1997i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f1998j;

    /* renamed from: k  reason: collision with root package name */
    public final List f1999k;

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, K k5, List list7, boolean z7, Map map, List list8) {
        super(str, list, z7);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((k) list2.get(i7)).f1989a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.f1994e = Collections.unmodifiableList(list2);
        Collections.unmodifiableList(list3);
        this.f = Collections.unmodifiableList(list4);
        this.f1995g = Collections.unmodifiableList(list5);
        Collections.unmodifiableList(list6);
        this.f1996h = k5;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f1997i = list9;
        this.f1998j = Collections.unmodifiableMap(map);
        this.f1999k = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((j) list.get(i7)).f1986a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i7, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 < list2.size()) {
                    G2.a aVar = (G2.a) list2.get(i9);
                    if (aVar.f746r == i7 && aVar.f747s == i8) {
                        arrayList.add(obj);
                        break;
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    @Override // L2.m
    public final Object a(List list) {
        return new l(this.f2000a, this.f2001b, c(this.f1994e, 0, list), Collections.emptyList(), c(this.f, 1, list), c(this.f1995g, 2, list), Collections.emptyList(), this.f1996h, this.f1997i, this.f2002c, this.f1998j, this.f1999k);
    }
}
