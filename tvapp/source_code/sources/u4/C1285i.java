package u4;

import java.io.File;
import java.io.FilenameFilter;
/* renamed from: u4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1285i implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15000a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f15000a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                if (str.startsWith("event") && !str.endsWith("_")) {
                    return true;
                }
                return false;
        }
    }
}
