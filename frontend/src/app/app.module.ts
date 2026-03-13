import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { MainLayoutComponent } from './core/layout/main-layout.component';
import { AppRoutingModule } from './app-routing.module';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { InputTextModule } from 'primeng/inputtext';

@NgModule({
  declarations: [AppComponent, MainLayoutComponent],
  imports: [BrowserModule, HttpClientModule, ReactiveFormsModule, RouterModule, AppRoutingModule, TableModule, ButtonModule, InputTextModule],
  bootstrap: [AppComponent]
})
export class AppModule {}
