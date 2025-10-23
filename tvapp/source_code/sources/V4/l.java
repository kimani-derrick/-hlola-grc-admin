package V4;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f3702a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3703b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3704c;
    public final e d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public l(ScheduledExecutorService scheduledExecutorService, e eVar, e eVar2) {
        this.f3703b = scheduledExecutorService;
        this.f3704c = eVar;
        this.d = eVar2;
    }

    public final void a(U4.m mVar) {
        synchronized (this.f3702a) {
            this.f3702a.add(mVar);
        }
    }
}
