package L2;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f2000a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2001b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2002c;

    public m(String str, List list, boolean z7) {
        this.f2000a = str;
        this.f2001b = Collections.unmodifiableList(list);
        this.f2002c = z7;
    }

    public abstract Object a(List list);
}
