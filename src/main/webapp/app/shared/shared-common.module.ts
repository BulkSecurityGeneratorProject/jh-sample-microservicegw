import { NgModule } from '@angular/core';

import { JhSampleMicroserviceGwSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [JhSampleMicroserviceGwSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [JhSampleMicroserviceGwSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class JhSampleMicroserviceGwSharedCommonModule {}
